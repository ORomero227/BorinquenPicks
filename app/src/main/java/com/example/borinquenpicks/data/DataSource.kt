package com.example.borinquenpicks.data

import com.example.borinquenpicks.R
import com.example.borinquenpicks.model.Category

object DataSource {

    val categories = listOf(
        Category("Restaurants", R.drawable.ic_restaurant),
        Category("Shopping Centers", R.drawable.ic_shoppingmalls),
        Category("Coffee Shops", R.drawable.ic_coffeeshops),
        Category("Beaches", R.drawable.ic_beaches),
        Category("Parks and Preserves", R.drawable.ic_parks),
        Category("Attractions", R.drawable.ic_attractions),
    )

}