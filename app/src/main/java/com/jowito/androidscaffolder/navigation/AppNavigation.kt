package com.jowito.androidscaffolder.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jowito.androidscaffolder.ui.example.ExampleScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = ExampleScreen) {
        composable<ExampleScreen> {
            ExampleScreen() {  }
        }
    }
}