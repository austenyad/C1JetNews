package com.austen.c1jetnews

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.austen.c1jetnews.ui.JetNewsApp
import com.austen.c1jetnews.ui.theme.C1JetNewsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            C1JetNewsTheme {
                JetNewsApp()
            }
        }
    }
}
