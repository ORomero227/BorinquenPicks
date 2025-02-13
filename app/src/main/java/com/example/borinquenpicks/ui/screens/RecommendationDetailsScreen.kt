package com.example.borinquenpicks.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.borinquenpicks.R
import com.example.borinquenpicks.data.Recommendations
import com.example.borinquenpicks.model.Recommendation
import com.example.borinquenpicks.ui.theme.BorinquenPicksTheme

@Composable
fun RecommendationDetailScreen(
    recommendation: Recommendation,
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
    ) {
        RecommendationDetails(
            recommendation = recommendation,
            modifier = Modifier.fillMaxWidth().padding(16.dp).weight(1f)
        )
        NavigationButtons(
            navigateBack = navigateBack,
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        )
    }
}

@Composable
fun RecommendationDetails(
    recommendation: Recommendation,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "Recommendation Image",
            modifier = Modifier
                .fillMaxWidth()
                .size(200.dp),
            contentScale = ContentScale.Crop
        )

        // Address with Location Icon
        Row(
            modifier = Modifier.fillMaxWidth(),
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
                fontSize = 16.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Start
            )
        }

        // Name
        Text(
            text = recommendation.name,
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start
        )

        // Description
        Text(
            text = recommendation.description,
            fontSize = 14.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start
        )
    }
}

@Composable
fun NavigationButtons(
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier,
    ) {
        Button(
            onClick = { navigateBack() },
            modifier = Modifier.weight(1f)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = stringResource(R.string.go_back)
                )
                Text(text = stringResource(R.string.go_back), fontSize = 20.sp)
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun RecommendationDetailsPreview() {
    BorinquenPicksTheme {
        RecommendationDetailScreen(
            modifier = Modifier.fillMaxSize(),
            recommendation = Recommendations.restaurants[0],
            navigateBack = {}
        )
    }
}