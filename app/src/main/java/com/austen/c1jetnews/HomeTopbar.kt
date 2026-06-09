package com.austen.c1jetnews

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


/**
 * 首页顶部 栏
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeTopbar(modifier: Modifier = Modifier, onDrawer: () -> Unit) {
    CenterAlignedTopAppBar(modifier = modifier, title = {
        Image(
            painter = painterResource(R.drawable.ic_jetnews_wordmark),
            contentDescription = null,
            colorFilter = ColorFilter.tint(color = Color.Blue)
        )
    }, navigationIcon = {
        Image(
            modifier = Modifier
                .padding(start = 15.dp)
                .clickable(onClick = onDrawer),
            painter = painterResource(R.drawable.ic_jetnews_logo),
            contentDescription = null,
            colorFilter = ColorFilter.tint(color = Color.Blue)
        )
    }, actions = {
        Image(
            modifier = Modifier.padding(end = 15.dp),
            painter = painterResource(R.drawable.ic_search),
            contentDescription = null,
            colorFilter = ColorFilter.tint(color = Color.Blue)
        )
    })


}


@Preview
@Composable
private fun HomeTopbarPreview() {
    HomeTopbar(onDrawer = {})
}