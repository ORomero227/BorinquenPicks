package com.example.borinquenpicks.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import com.example.borinquenpicks.ui.screens.RecommendationDetailScreen
import com.example.borinquenpicks.ui.screens.RecommendationsScreen
import com.example.borinquenpicks.ui.theme.BorinquenPicksTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BorinquenPicksAppBar(
    title: String,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    CenterAlignedTopAppBar(
        title = { Text(title) },
        navigationIcon = {
            if(canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.back_button)
                    )
                }
            }
        },
        modifier = modifier
    )
}


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
            when(val screen = uiState.currentScreen) {
                is Screen.Categories -> BorinquenPicksAppBar(
                    title = stringResource(R.string.app_name),
                    canNavigateBack = false,
                    navigateUp = {},
                    modifier = Modifier.fillMaxWidth()
                )
                is Screen.Recommendations -> BorinquenPicksAppBar(
                    title = stringResource(screen.category.title),
                    canNavigateBack = true,
                    navigateUp = { viewModel.navigateBack() }
                )
                is Screen.RecommendationDetail -> {}
            }
        },


    ) { innerPadding ->

        when (val screen = uiState.currentScreen) {
            is Screen.Categories -> {
                CategoriesScreen(
                    categories = Categories.categories,
                    switchToRecommendations = { category ->
                        viewModel.setSelectedCategory(category)
                        viewModel.navigateTo(Screen.Recommendations(category))
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
                    showRecommendationDetail = { recommendation ->
                            viewModel.navigateToRecommendationDetail(recommendation)
                    },
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding)
                        .padding(horizontal = 16.dp),
                    )
            }
            is Screen.RecommendationDetail -> {
                RecommendationDetailScreen(
                    recommendation = uiState.currentRecommendation!!,
                    navigateBack = {
                        viewModel.navigateBack()
                    },
                    modifier = Modifier.fillMaxSize().padding(innerPadding)
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