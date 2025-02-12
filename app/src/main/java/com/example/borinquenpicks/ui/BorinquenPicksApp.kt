package com.example.borinquenpicks.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.borinquenpicks.R
import com.example.borinquenpicks.data.Categories
import com.example.borinquenpicks.model.BorinquenPicksViewModel
import com.example.borinquenpicks.ui.navigation.Screen
import com.example.borinquenpicks.ui.screens.CategoriesScreen
import com.example.borinquenpicks.ui.screens.RecommendationsScreen
import com.example.borinquenpicks.ui.theme.BorinquenPicksTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BorinquenPicksApp(
    viewModel: BorinquenPicksViewModel = viewModel()
) {

    val uiState by viewModel.uiState.collectAsState()

    BackHandler(enabled = true) {
        viewModel.navigateBack()
    }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    when(val screen = uiState.currentScreen) {
                        is Screen.Categories -> Text(stringResource(R.string.app_name))
                        is Screen.Recommendations -> Text(stringResource(screen.category.title))
                    }
                },
                navigationIcon = {

                },
                modifier = Modifier.fillMaxWidth()
            )
        },
    ) { innerPadding ->

        when (val screen = uiState.currentScreen) {
            is Screen.Categories -> {
                CategoriesScreen(
                    categories = Categories.categories,
                    switchToRecommendations = { category ->
                        viewModel.navigateTo(
                            Screen.Recommendations(category)
                        )
                    },
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding)
                        .padding(10.dp)
                )
            }
            is Screen.Recommendations -> {
                RecommendationsScreen(
                    categoryRecommendations = screen.category.recommendations,
                    categoryImage = screen.category.image,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding)
                        .padding(horizontal = 16.dp),
                    )
            }
        }
    }
}

@Preview
@Composable
fun BorinquenPicksAppPreview() {
    BorinquenPicksTheme {
        BorinquenPicksApp()
    }
}