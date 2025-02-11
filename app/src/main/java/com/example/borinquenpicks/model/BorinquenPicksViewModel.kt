package com.example.borinquenpicks.model

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BorinquenPicksViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(BorinquenPicksUiState())
    val uiState: StateFlow<BorinquenPicksUiState> = _uiState.asStateFlow()

    fun switchToRecommendations() {
        _uiState.update { currentState ->
            currentState.copy(
                isShowingCategories = false,
                isShowingRecommendations = true
            )
        }
    }
}