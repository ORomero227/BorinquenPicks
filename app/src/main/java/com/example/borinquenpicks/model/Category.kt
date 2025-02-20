package com.example.borinquenpicks.model

data class Category (
    val id: String = "",
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

