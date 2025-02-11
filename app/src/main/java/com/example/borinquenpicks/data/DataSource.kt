package com.example.borinquenpicks.data

import com.example.borinquenpicks.R
import com.example.borinquenpicks.model.Category

object DataSource {

    val categories = listOf(
        Category(R.string.restaurants, R.drawable.ic_restaurant),
        Category(R.string.shopping_centers, R.drawable.ic_shopping_centers),
        Category(R.string.coffee_shops, R.drawable.ic_coffeeshops),
        Category(R.string.beaches, R.drawable.ic_beaches),
        Category(R.string.parks_preserves, R.drawable.ic_parks),
        Category(R.string.attractions, R.drawable.ic_attractions),
    )

}