package com.example.borinquenpicks.model

import androidx.annotation.StringRes
import com.example.borinquenpicks.R

data class BorinquenPicksUiState(
    @StringRes val currentScreen: Int = R.string.app_name,
    val isShowingCategories: Boolean = true,
    val isShowingRecommendations: Boolean = false,
)