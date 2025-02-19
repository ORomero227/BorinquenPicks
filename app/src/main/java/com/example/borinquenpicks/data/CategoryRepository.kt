package com.example.borinquenpicks.data

import android.util.Log
import com.example.borinquenpicks.model.Category
import com.google.firebase.database.FirebaseDatabase
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

private const val TAG = "CategoriesRepo"

interface CategoriesRepository {
    suspend fun getCategories(): List<Category>
}

class FirebaseCategoriesRepository: CategoriesRepository {
    private val database = FirebaseDatabase.getInstance()
    private val categoriesRef = database.getReference("categories")

    override suspend fun getCategories(): List<Category> {
        return suspendCancellableCoroutine { continuation ->
            val listener = categoriesRef.get().addOnSuccessListener { snapshot ->
                val categories = snapshot.children.mapNotNull { it.getValue(Category::class.java) }
                continuation.resume(categories)
            }.addOnFailureListener { exception ->
                Log.e(TAG, "Error getting categories")
                continuation.resumeWithException(exception)
            }
            continuation.invokeOnCancellation {
                listener.isCanceled
            }
        }
    }
}