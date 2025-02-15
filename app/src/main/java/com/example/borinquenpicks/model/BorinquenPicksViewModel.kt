package com.example.borinquenpicks.model

import android.net.Uri
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.borinquenpicks.ui.navigation.Screen
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class BorinquenPicksViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(BorinquenPicksUiState())
    val uiState: StateFlow<BorinquenPicksUiState> = _uiState.asStateFlow()

    private val storage = Firebase.storage

    private fun loadRecommendationImage(recommendation: Recommendation) {

        _uiState.update { currentState ->
            currentState.copy(
                currentRecommendation = recommendation.copy(isLoading = true)
            )
        }

        val recommendationCategory = recommendation.categoryName
        val recommendationId = recommendation.id

        val imagePath = "$recommendationCategory/image$recommendationId.webp"
        val imageRef = storage.reference.child(imagePath)

        viewModelScope.launch {
            // Success
            imageRef.downloadUrl
                .addOnSuccessListener { uri: Uri ->
                    _uiState.update { currentState ->
                        currentState.copy(
                            currentRecommendation = currentState.currentRecommendation?.copy(
                                image = uri.toString(),
                                isLoading = false,
                                error = null
                            )
                        )
                    }
                }
                // Error
                .addOnFailureListener { exception ->
                    _uiState.update { currentState ->
                        currentState.copy(
                            currentRecommendation = currentState.currentRecommendation?.copy(
                                isLoading = false,
                                error = exception.message
                            )
                        )
                    }
                }
        }
    }


    fun setSelectedCategory(category: Category) {
        _uiState.update { currentState ->
            currentState.copy(
                selectedCategory = category
            )
        }
    }


    fun navigateTo(screen: Screen) {
        _uiState.update { currentState ->
            currentState.copy(
                currentScreen = screen
            )
        }
    }

    fun navigateToRecommendationDetail(recommendation: Recommendation) {
        _uiState.update { currentState ->
            currentState.copy(
                currentScreen = Screen.RecommendationDetail(recommendation),
                currentRecommendation = recommendation
            )
        }
        loadRecommendationImage(recommendation)
    }

    fun navigateBack() {
        _uiState.update { currentState ->
            when (currentState.currentScreen) {
                is Screen.Recommendations ->
                    currentState.copy(
                        currentScreen = Screen.Categories
                    )

                is Screen.RecommendationDetail ->
                    currentState.copy(
                        currentScreen = Screen.Recommendations(currentState.selectedCategory),
                        currentRecommendation = null
                    )

                is Screen.Categories ->
                    currentState
            }
        }
    }
}