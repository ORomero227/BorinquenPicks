package com.example.borinquenpicks.data

import android.util.Log
import com.example.borinquenpicks.model.Recommendation
import com.google.firebase.database.FirebaseDatabase
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException


private const val TAG = "RecommendationRepo"

interface RecommendationRepository {
    suspend fun getRecommendations(categoryId: String): List<Recommendation>
}

class FirebaseRecommendationsRepository: RecommendationRepository {

    private val database = FirebaseDatabase.getInstance()

    override suspend fun getRecommendations(categoryId: String): List<Recommendation> {
        val recommendationsRef = database.getReference("recommendations").child(categoryId)

        return suspendCancellableCoroutine { continuation ->
            val listener = recommendationsRef.get().addOnSuccessListener { snapshot ->
                val recommendation = snapshot.children.mapNotNull { it.getValue(Recommendation::class.java) }
                continuation.resume(recommendation)
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