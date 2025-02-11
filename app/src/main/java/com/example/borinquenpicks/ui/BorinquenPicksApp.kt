package com.example.borinquenpicks.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import com.example.borinquenpicks.data.DataSource
import com.example.borinquenpicks.model.BorinquenPicksViewModel
import com.example.borinquenpicks.ui.screens.CategoriesScreen
import com.example.borinquenpicks.ui.screens.RecommendationsScreen
import com.example.borinquenpicks.ui.theme.BorinquenPicksTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BorinquenPicksApp(
    viewModel: BorinquenPicksViewModel = viewModel()
) {

    val uiState by viewModel.uiState.collectAsState()

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(stringResource(uiState.currentScreen)) },
                modifier = Modifier.fillMaxWidth()
            )
        },
    ) { innerPadding ->
        if(uiState.isShowingCategories) {
            CategoriesScreen(
                categories = DataSource.categories,
                switchToRecommendations = { viewModel.switchToRecommendations() },
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(10.dp)
            )
        } else if(uiState.isShowingRecommendations) {
            RecommendationsScreen()
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