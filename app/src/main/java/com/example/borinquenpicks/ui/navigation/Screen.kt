package com.example.borinquenpicks.ui.navigation

import com.example.borinquenpicks.model.Category
import com.example.borinquenpicks.model.Recommendation

sealed class Screen {
    data object Categories: Screen()
    data class Recommendations(val category: Category): Screen()
    data class RecommendationDetail(val recommendation: Recommendation) : Screen()
}