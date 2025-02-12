package com.example.borinquenpicks.ui.navigation

import com.example.borinquenpicks.model.Category

sealed class Screen {
    data object Categories: Screen()
    data class Recommendations(val category: Category): Screen()
}