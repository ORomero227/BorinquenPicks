package com.example.borinquenpicks.model

import com.example.borinquenpicks.R

data class Category (
    val title: String = "",
    val image: String = "",
    val recommendations: List<Recommendation> = emptyList()
) {
    companion object {
        val Default = Category(
            title = "Default Category",
            image = "",
            recommendations = emptyList()
        )
    }
}

