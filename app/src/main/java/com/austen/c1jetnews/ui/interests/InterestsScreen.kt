package com.austen.c1jetnews.ui.interests

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data object InterestsKey : NavKey


fun EntryProviderScope<NavKey>.interestsEntry() {
    entry<InterestsKey> {
        InterestsScreen()
    }
}

/**
 * 感兴趣 UI 入口
 */
@Composable
fun InterestsScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.background(Color.Blue), contentAlignment = Alignment.Center) {
        Text("兴趣", fontSize = 30.sp)
    }
}
