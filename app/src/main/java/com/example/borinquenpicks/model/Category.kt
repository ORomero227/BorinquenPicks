package com.example.borinquenpicks.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Category (
    @StringRes val title: Int,
    @DrawableRes val image: Int,
)

