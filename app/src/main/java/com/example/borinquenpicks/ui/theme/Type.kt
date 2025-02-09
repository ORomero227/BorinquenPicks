package com.example.borinquenpicks.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.example.borinquenpicks.R


val Roboto = FontFamily(
    Font(R.font.roboto_regular)
)

// Default Material 3 typography values
val baseline = Typography()

val AppTypography = Typography(
    displayLarge = baseline.displayLarge.copy(fontFamily = Roboto),
    displayMedium = baseline.displayMedium.copy(fontFamily = Roboto),
    displaySmall = baseline.displaySmall.copy(fontFamily = Roboto),
    headlineLarge = baseline.headlineLarge.copy(fontFamily = Roboto),
    headlineMedium = baseline.headlineMedium.copy(fontFamily = Roboto),
    headlineSmall = baseline.headlineSmall.copy(fontFamily = Roboto),
    titleLarge = baseline.titleLarge.copy(fontFamily = Roboto),
    titleMedium = baseline.titleMedium.copy(fontFamily = Roboto),
    titleSmall = baseline.titleSmall.copy(fontFamily = Roboto),
    bodyLarge = baseline.bodyLarge.copy(fontFamily = Roboto),
    bodyMedium = baseline.bodyMedium.copy(fontFamily = Roboto),
    bodySmall = baseline.bodySmall.copy(fontFamily = Roboto),
    labelLarge = baseline.labelLarge.copy(fontFamily = Roboto),
    labelMedium = baseline.labelMedium.copy(fontFamily = Roboto),
    labelSmall = baseline.labelSmall.copy(fontFamily = Roboto),
)

