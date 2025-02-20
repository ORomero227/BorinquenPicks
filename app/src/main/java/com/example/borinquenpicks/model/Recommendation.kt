package com.example.borinquenpicks.model

data class Recommendation(
    val id: String = "",
    val name: String = "",
    val description: String = "",
    val address: String = "",
    val image: String = "",
    val categoryName:String  = "",
    val isLoading: Boolean = false,
    val error: String? = null
)

