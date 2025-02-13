package com.example.borinquenpicks.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.borinquenpicks.R

data class Category (
    @StringRes val title: Int,
    @DrawableRes val image: Int,
    val recommendations: List<Recommendation>
) {
    companion object {
        val Default = Category(
            title = R.string.default_category_title,
            image = 0,
            recommendations = emptyList()
        )
    }
}

