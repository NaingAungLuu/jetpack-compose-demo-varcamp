package me.naingaungluu.jetpackcomposedemo.ui.screens.interopDemo

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview (showBackground = true)
@Composable
fun InteroperabilityDemoScreen(
    onTapButton : () -> Unit = {}
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        ShowWebViewButton(onTapButton)
    }
}

@Preview (showBackground = true)
@Composable
fun ShowWebViewButton(
    onTapButton : () -> Unit = {}
) {
    Button(onClick = onTapButton) {
        Text(text = "Show Web View")
    }
}