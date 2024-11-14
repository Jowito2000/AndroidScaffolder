package com.jowito.androidscaffolder.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jowito.androidscaffolder.ui.example.ExampleScreen
import com.jowito.androidscaffolder.ui.example.ExampleViewModel

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = ExampleScreen) {
        composable<ExampleScreen> { _ ->
            val viewModel = hiltViewModel<ExampleViewModel>()
            ExampleScreen(viewModel)
        }
    }
}