package com.example.borinquenpicks.model

import com.example.borinquenpicks.ui.navigation.Screen

data class BorinquenPicksUiState(
    val currentScreen: Screen = Screen.Categories,

    val categories: List<Category> = listOf(),
    val selectedCategory: Category = Category.Default,

    val recommendations: List<Recommendation> = listOf(),
    val currentRecommendation: Recommendation? = null,

    val categoriesLoading: Boolean = true,
    val recommendationsLoading: Boolean = true
)