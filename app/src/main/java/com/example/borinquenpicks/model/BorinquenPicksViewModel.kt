package com.example.borinquenpicks.model

import androidx.lifecycle.ViewModel
import com.example.borinquenpicks.ui.navigation.Screen
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BorinquenPicksViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(BorinquenPicksUiState())
    val uiState: StateFlow<BorinquenPicksUiState> = _uiState.asStateFlow()

    fun navigateTo(screen: Screen) {
        _uiState.update { currentState ->
            currentState.copy(
                currentScreen = screen
            )
        }
    }

    fun navigateBack() {
        _uiState.update { currentState ->
            when(currentState.currentScreen) {
                is Screen.Recommendations ->
                    currentState.copy(
                        currentScreen = Screen.Categories
                    )
                is Screen.Categories ->
                    currentState
            }
        }
    }
}