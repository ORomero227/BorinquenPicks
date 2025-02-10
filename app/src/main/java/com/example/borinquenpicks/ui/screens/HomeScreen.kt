package com.example.borinquenpicks.ui.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.borinquenpicks.R
import com.example.borinquenpicks.data.DataSource.categories
import com.example.borinquenpicks.model.Category
import com.example.borinquenpicks.ui.theme.BorinquenPicksTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = { Text(stringResource(R.string.app_name)) },
                    modifier = Modifier.fillMaxWidth(),
                )
            }
        ) { innerPadding ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(8.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                items(categories.chunked(2)) { rowItems ->
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(5.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        rowItems.forEach{ category ->
                            CategoryItem(
                                category = category,
                                modifier = Modifier.weight(1f).aspectRatio(1f)
                            )
                        }
                    }
                }
            }
        }
    }
}

/*
* Card that represents each category item
* */
@Composable
fun CategoryItem(category: Category, modifier: Modifier = Modifier) {
    var isPressed by remember { mutableStateOf(false) }

    val scale by animateFloatAsState(
        targetValue = if(isPressed) 0.95F else 1f
    )
    
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = if(isPressed) 4.dp else 2.dp
        ),
        modifier = modifier.clickable { isPressed = !isPressed },
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                Image(
                    painter = painterResource(category.image),
                    contentDescription = category.name,
                    modifier = Modifier.size(70.dp)
                )
                Text(
                    text = category.name,
                    style = typography.bodyLarge,
                    textAlign = TextAlign.Center,
                    maxLines = 2,
                    modifier = Modifier.fillMaxWidth().padding(top = 16.dp).scale(scale)
                )
            }
        }
    }
}

@Preview(name = "LightTheme")
@Composable
fun HomeScreenLightThemePreview() {
    BorinquenPicksTheme {
        HomeScreen()
    }
}

@Preview(name = "DarkTheme")
@Composable
fun HomeScreenDarkThemePreview() {
    BorinquenPicksTheme(darkTheme = true) {
        HomeScreen()
    }
}