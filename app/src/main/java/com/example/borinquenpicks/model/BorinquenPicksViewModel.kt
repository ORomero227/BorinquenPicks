package com.example.borinquenpicks.model

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.borinquenpicks.data.FirebaseCategoriesRepository
import com.example.borinquenpicks.ui.navigation.Screen
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class BorinquenPicksViewModel(
    private val categoriesRepository: FirebaseCategoriesRepository = FirebaseCategoriesRepository()
) : ViewModel() {

    private val _uiState = MutableStateFlow(BorinquenPicksUiState())
    val uiState: StateFlow<BorinquenPicksUiState> = _uiState.asStateFlow()

    init {
        loadCategories()
    }

    private fun loadCategories() {

        viewModelScope.launch {
            try {
                val categories = categoriesRepository.getCategories()
                Log.d("My Viewmodel", "Received categories: ${categories.size}")
                _uiState.update { currentState ->
                    currentState.copy(
                        categories = categories
                    )
                }
            } catch (e: Exception){
                Log.e("My Viewmodel", "Error receiving categories", e)
            } finally {
                _uiState.update { currentState ->
                    currentState.copy(
                        categoriesLoading = false
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
//        loadRecommendationImage(recommendation)
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