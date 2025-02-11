package com.example.borinquenpicks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.borinquenpicks.ui.BorinquenPicksApp
import com.example.borinquenpicks.ui.theme.BorinquenPicksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BorinquenPicksTheme {
                BorinquenPicksApp()
            }
        }
    }
}