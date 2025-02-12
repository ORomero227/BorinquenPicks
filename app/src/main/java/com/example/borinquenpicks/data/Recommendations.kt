package com.example.borinquenpicks.data

import com.example.borinquenpicks.model.Recommendation

object Recommendations {

    val restaurants = listOf(
        Recommendation(
            name = "Marmalade",
            description = "Innovative cuisine with a tasting menu featuring local ingredients.",
            address = "Old San Juan",
        ),
        Recommendation(
            name = "José Enrique",
            description = "Contemporary Puerto Rican cuisine with fresh ingredients.",
            address = "Santurce",
        ),
        Recommendation(
            name = "Santaella",
            description = "Fusion of Puerto Rican cuisine with international influences.",
            address = "Santurce",
        ),
        Recommendation(
            name = "La Mallorquina",
            description = "The oldest restaurant in Puerto Rico, specializing in Spanish and Puerto Rican cuisine.",
            address = "Old San Juan",
        ),
        Recommendation(
            name = "Pikayo",
            description = "Fine dining with a mix of local and international flavors.",
            address = "San Juan",
        )
    )

    val shopping_centers = listOf(
        Recommendation(
            name = "Plaza Las Américas",
            description = "The largest shopping mall in the Caribbean, with over 300 stores.",
            address = "San Juan",
        ),
        Recommendation(
            name = "The Mall of San Juan",
            description = "Luxury stores like Nordstrom and Saks Fifth Avenue.",
            address = "San Juan",
        ),
        Recommendation(
            name = "Plaza del Caribe",
            description = "The largest shopping mall in the southern part of the island, featuring a cinema and popular stores.",
            address = "Ponce",
        ),
        Recommendation(
            name = "Plaza Río Hondo",
            description = "Shopping mall with a wide range of stores and restaurants.",
            address = "Bayamón",
        ),
        Recommendation(
            name = "Las Catalinas Mall",
            description = "Variety of stores and entertainment options in the central region.",
            address = "Caguas",
        ),
    )

    val coffee_shops = listOf(
        Recommendation(
            name = "Café Cuatro Sombras",
            description = "Premium-quality coffee from its own farm in Yauco.",
            address = "Old San Juan",
        ),
        Recommendation(
            name = "Hacienda San Pedro",
            description = "Coffee from its own estate in Jayuya, with a rustic atmosphere.",
            address = "San Juan",
        ),
        Recommendation(
            name = "Café Don Ruiz",
            description = "Located in Cuartel de Ballajá, serving coffee from its own farm.",
            address = "Old San Juan",
        ),
        Recommendation(
            name = "Café Cola'o",
            description = "Authentic Puerto Rican coffee with a view of the port.",
            address = "Old San Juan",
        ),
        Recommendation(
            name = "Finca Cialitos",
            description = "Organic coffee grown in Ciales.",
            address = "Old San Juan",
        ),
    )

    val parks = listOf(
        Recommendation(
            name = "El Yunque National Forest",
            description = "Tropical rainforest with waterfalls and hiking trails.",
            address = "Northeastern Puerto Rico",
        ),
        Recommendation(
            name = "Guánica Dry Forest Reserve",
            description = "Dry coastal forest with diverse plant and bird species.",
            address = "Southwestern Puerto Rico",
        ),
        Recommendation(
            name = "Río Camuy Cave Park",
            description = "Large cave system with underground rivers.",
            address = "Northwestern Puerto Rico",
        ),
        Recommendation(
            name = "Toro Negro State Forest",
            description = "Mountainous forest with waterfalls and high elevations.",
            address = "Central Puerto Rico",
        ),
        Recommendation(
            name = "Cabo Rojo National Wildlife Refuge",
            description = "Coastal refuge with salt flats and birdwatching.",
            address = "Southwestern Puerto Rico",
        ),
    )

    val beaches = listOf(
        Recommendation(
            name = "Flamenco Beach",
            description = "White sand, clear turquoise waters.",
            address = "Culebra Island",
        ),
        Recommendation(
            name = "Luquillo Beach",
            description = "Calm waters, palm trees, family-friendly.",
            address = "Northeastern Puerto Rico",
        ),
        Recommendation(
            name = "Isla Verde Beach",
            description = "Urban beach with water sports.",
            address = "San Juan",
        ),
        Recommendation(
            name = "Sun Bay",
            description = "White sand, calm waters.",
            address = "Vieques Island",
        ),
        Recommendation(
            name = "Condado Beach",
            description = "Upscale beach in San Juan.",
            address = "San Juan",
        ),
    )

    val attractions = listOf(
        Recommendation(
            name = "Old San Juan",
            description = "Historic district with forts and colonial buildings.",
            address = "San Juan",
        ),
        Recommendation(
            name = "Castillo San Felipe del Morro",
            description = "16th-century citadel with ocean views.",
            address = "Old San Juan",
        ),
        Recommendation(
            name = "Castillo San Cristobal",
            description = "Largest Spanish fort in the Americas.",
            address = "Old San Juan",
        ),
        Recommendation(
            name = "Bacardi Rum Distillery",
            description = "Rum distillery with tours and tastings.",
            address = "Cataño",
        ),
        Recommendation(
            name = "Arecibo Observatory",
            description = "(Currently Closed) Radio telescope site.",
            address = "Arecibo",
        ),
    )

}