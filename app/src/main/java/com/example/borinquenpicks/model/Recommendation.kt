package com.example.borinquenpicks.model

import androidx.annotation.DrawableRes

data class Recommendation(
    val id: String,
    val name: String,
    val description: String,
    val address: String,
    val image: String? = null,
    val categoryName: String,
    val isLoading: Boolean = false,
    val error: String? = null
)

