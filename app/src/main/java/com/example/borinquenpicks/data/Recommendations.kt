package com.example.borinquenpicks.data

import com.example.borinquenpicks.model.Recommendation

object Recommendations {

    val restaurants = listOf(
        Recommendation(
            id = "1",
            name = "Marmalade",
            description = "Innovative cuisine with a tasting menu featuring local ingredients.",
            address = "Old San Juan",
            categoryName = "restaurants"
        ),
        Recommendation(
            id = "2",
            name = "José Enrique",
            description = "Contemporary Puerto Rican cuisine with fresh ingredients.",
            address = "Santurce",
            categoryName = "restaurants"
        ),
        Recommendation(
            id = "3",
            name = "Santaella",
            description = "Fusion of Puerto Rican cuisine with international influences.",
            address = "Santurce",
            categoryName = "restaurants"
        ),
        Recommendation(
            id = "4",
            name = "La Mallorquina",
            description = "The oldest restaurant in Puerto Rico, specializing in Spanish and Puerto Rican cuisine.",
            address = "Old San Juan",
            categoryName = "restaurants"
        ),
        Recommendation(
            id = "5",
            name = "Pikayo",
            description = "Fine dining with a mix of local and international flavors.",
            address = "San Juan",
            categoryName = "restaurants"
        )
    )

    val shopping_centers = listOf(
        Recommendation(
            id = "1",
            name = "Plaza Las Américas",
            description = "The largest shopping mall in the Caribbean, with over 300 stores.",
            address = "San Juan",
            categoryName = "shopping centers"
        ),
        Recommendation(
            id = "2",
            name = "The Mall of San Juan",
            description = "Luxury stores like Nordstrom and Saks Fifth Avenue.",
            address = "San Juan",
            categoryName = "shopping centers"
        ),
        Recommendation(
            id = "3",
            name = "Plaza del Caribe",
            description = "The largest shopping mall in the southern part of the island, featuring a cinema and popular stores.",
            address = "Ponce",
            categoryName = "shopping centers"
        ),
        Recommendation(
            id = "4",
            name = "Plaza Río Hondo",
            description = "Shopping mall with a wide range of stores and restaurants.",
            address = "Bayamón",
            categoryName = "shopping centers"
        ),
        Recommendation(
            id = "5",
            name = "Las Catalinas Mall",
            description = "Variety of stores and entertainment options in the central region.",
            address = "Caguas",
            categoryName = "shopping centers"
        ),
    )

    val coffee_shops = listOf(
        Recommendation(
            id = "1",
            name = "Café Cuatro Sombras",
            description = "Premium-quality coffee from its own farm in Yauco.",
            address = "Old San Juan",
            categoryName = "coffee shops"
        ),
        Recommendation(
            id = "2",
            name = "Hacienda San Pedro",
            description = "Coffee from its own estate in Jayuya, with a rustic atmosphere.",
            address = "San Juan",
            categoryName = "coffee shops"
        ),
        Recommendation(
            id = "3",
            name = "Café Don Ruiz",
            description = "Located in Cuartel de Ballajá, serving coffee from its own farm.",
            address = "Old San Juan",
            categoryName = "coffee shops"
        ),
        Recommendation(
            id = "4",
            name = "Café Cola'o",
            description = "Authentic Puerto Rican coffee with a view of the port.",
            address = "Old San Juan",
            categoryName = "coffee shops"
        ),
        Recommendation(
            id = "5",
            name = "Finca Cialitos",
            description = "Organic coffee grown in Ciales.",
            address = "Old San Juan",
            categoryName = "coffee shops"
        ),
    )

    val parks = listOf(
        Recommendation(
            id = "1",
            name = "El Yunque National Forest",
            description = "Tropical rainforest with waterfalls and hiking trails.",
            address = "Northeastern Puerto Rico",
            categoryName = "parks"
        ),
        Recommendation(
            id = "2",
            name = "Guánica Dry Forest Reserve",
            description = "Dry coastal forest with diverse plant and bird species.",
            address = "Southwestern Puerto Rico",
            categoryName = "parks"
        ),
        Recommendation(
            id = "3",
            name = "Río Camuy Cave Park",
            description = "Large cave system with underground rivers.",
            address = "Northwestern Puerto Rico",
            categoryName = "parks"
        ),
        Recommendation(
            id = "4",
            name = "Toro Negro State Forest",
            description = "Mountainous forest with waterfalls and high elevations.",
            address = "Central Puerto Rico",
            categoryName = "parks"
        ),
        Recommendation(
            id = "5",
            name = "Cabo Rojo National Wildlife Refuge",
            description = "Coastal refuge with salt flats and birdwatching.",
            address = "Southwestern Puerto Rico",
            categoryName = "parks"
        ),
    )

    val beaches = listOf(
        Recommendation(
            id = "1",
            name = "Flamenco Beach",
            description = "White sand, clear turquoise waters.",
            address = "Culebra Island",
            categoryName = "beaches"
        ),
        Recommendation(
            id = "2",
            name = "Luquillo Beach",
            description = "Calm waters, palm trees, family-friendly.",
            address = "Northeastern Puerto Rico",
            categoryName = "beaches"
        ),
        Recommendation(
            id = "3",
            name = "Isla Verde Beach",
            description = "Urban beach with water sports.",
            address = "San Juan",
            categoryName = "beaches"
        ),
        Recommendation(
            id = "4",
            name = "Sun Bay",
            description = "White sand, calm waters.",
            address = "Vieques Island",
            categoryName = "beaches"
        ),
        Recommendation(
            id = "5",
            name = "Condado Beach",
            description = "Upscale beach in San Juan.",
            address = "San Juan",
            categoryName = "beaches"
        ),
    )

    val attractions = listOf(
        Recommendation(
            id = "1",
            name = "Old San Juan",
            description = "Historic district with forts and colonial buildings.",
            address = "San Juan",
            categoryName = "attractions"
        ),
        Recommendation(
            id = "2",
            name = "Castillo San Felipe del Morro",
            description = "16th-century citadel with ocean views.",
            address = "Old San Juan",
            categoryName = "attractions"
        ),
        Recommendation(
            id = "3",
            name = "Castillo San Cristobal",
            description = "Largest Spanish fort in the Americas.",
            address = "Old San Juan",
            categoryName = "attractions"
        ),
        Recommendation(
            id = "4",
            name = "Bacardi Rum Distillery",
            description = "Rum distillery with tours and tastings.",
            address = "Cataño",
            categoryName = "attractions"
        ),
        Recommendation(
            id = "5",
            name = "Arecibo Observatory",
            description = "(Currently Closed) Radio telescope site.",
            address = "Arecibo",
            categoryName = "attractions"
        ),
    )
}