package com.jowito.androidscaffolder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.jowito.androidscaffolder.navigation.AppNavigation
import com.jowito.androidscaffolder.ui.theme.AndroidScaffolderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidScaffolderTheme {
                AppNavigation()
            }
        }
    }
}