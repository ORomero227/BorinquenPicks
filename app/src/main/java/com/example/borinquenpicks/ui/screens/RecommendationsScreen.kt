package com.example.borinquenpicks.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.borinquenpicks.R
import com.example.borinquenpicks.data.Recommendations
import com.example.borinquenpicks.model.Recommendation
import com.example.borinquenpicks.ui.theme.BorinquenPicksTheme

@Composable
fun RecommendationsScreen(
    categoryRecommendations: List<Recommendation>,
    categoryImage: Int,
    modifier: Modifier = Modifier
) {

    val sortedRecommendation = categoryRecommendations.sortedBy {
        it.name
    }

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = modifier,
        contentPadding = PaddingValues(
            vertical = 16.dp
        )
    ) {
        items(sortedRecommendation) { recommendation ->
            RecommendationItem(
                recommendation = recommendation,
                categoryImage = categoryImage,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun RecommendationItem(
    recommendation: Recommendation,
    categoryImage: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(categoryImage),
                contentDescription = null,
                modifier = Modifier
                    .size(65.dp)
                    .padding(end = 16.dp)
            )
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = recommendation.name,
                    fontSize = 20.sp
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        contentDescription = "Location Icon",
                        tint = Color.Red,
                        modifier = Modifier.padding(end = 4.dp)
                    )
                    Text(
                        text = recommendation.address,
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun RecommendationsScreenPreview() {
    BorinquenPicksTheme {
        RecommendationsScreen(
            categoryImage = R.drawable.ic_launcher_foreground,
            categoryRecommendations = Recommendations.restaurants
        )
    }
}
