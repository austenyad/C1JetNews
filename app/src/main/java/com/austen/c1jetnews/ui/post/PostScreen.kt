package com.austen.c1jetnews.ui.post

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
data object PostKey : NavKey


fun EntryProviderScope<NavKey>.postEntry() {
    entry<PostKey> {
        PostScreen()
    }
}

/**
 * 帖子详情页面 根
 */
@Composable
fun PostScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.background(Color.Red), contentAlignment = Alignment.Center) {
        Text("帖子详情", fontSize = 30.sp)
    }
}