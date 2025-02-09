package com.example.borinquenpicks.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.borinquenpicks.ui.theme.BorinquenPicksTheme

@Composable
fun HomeScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = colorScheme.background
    ) {
        Scaffold { innerPadding ->
            Text(
                text = "Borinquen Picks",
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    BorinquenPicksTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            Scaffold { innerPadding ->
                Text(
                    text = "Hello World",
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
    }
}