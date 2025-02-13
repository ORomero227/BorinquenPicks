package com.example.borinquenpicks.model

import com.example.borinquenpicks.ui.navigation.Screen

data class BorinquenPicksUiState(
    val currentScreen: Screen = Screen.Categories,
    val listOfRecommendations: List<Recommendation> = listOf(),
    val selectedCategory: Category = Category.Default
)