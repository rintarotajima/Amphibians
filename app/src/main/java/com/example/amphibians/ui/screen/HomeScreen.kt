package com.example.amphibians.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.amphibians.R

@Composable
fun HomeScreen(
    amphibiansUiState: AmphibiansUiState,
    modifier: Modifier = Modifier
) {

}

@Composable
fun LoadingScreen(
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(R.drawable.cached_24px),
        contentDescription = "",
        modifier = modifier
    )
}

@Preview
@Composable
fun LoadingScreenPreview() {
    LoadingScreen()
}