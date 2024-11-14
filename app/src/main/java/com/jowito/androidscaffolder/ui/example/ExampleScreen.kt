package com.jowito.androidscaffolder.ui.example

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun ExampleScreen(exampleViewModel: ExampleViewModel = hiltViewModel()) {
    Scaffold { padding ->
        Box(modifier = Modifier.padding(padding).fillMaxSize(),
            contentAlignment = Alignment.Center){
            Text(text = "Nada",
                textAlign = TextAlign.Center,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ExamplePreview() {
    ExampleScreen()
}