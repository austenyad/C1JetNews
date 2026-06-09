package com.austen.c1jetnews

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun HomeDrawerContent(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
            .statusBarsPadding()
    ) {

        Row {
            Image(
                modifier = Modifier
                    .padding(start = 15.dp),
                painter = painterResource(R.drawable.ic_jetnews_logo),
                contentDescription = null,
                colorFilter = ColorFilter.tint(color = Color.Blue)
            )
            Image(
                painter = painterResource(R.drawable.ic_jetnews_wordmark),
                contentDescription = null,
                colorFilter = ColorFilter.tint(color = Color.Blue)
            )
        }


        Row {
            Image(
                modifier = Modifier
                    .padding(start = 15.dp),
                painter = painterResource(R.drawable.ic_jetnews_logo),
                contentDescription = null,
                colorFilter = ColorFilter.tint(color = Color.Blue)
            )
            Image(
                painter = painterResource(R.drawable.ic_jetnews_wordmark),
                contentDescription = null,
                colorFilter = ColorFilter.tint(color = Color.Blue)
            )
        }

        Row {
            Image(
                modifier = Modifier
                    .padding(start = 15.dp),
                painter = painterResource(R.drawable.ic_jetnews_logo),
                contentDescription = null,
                colorFilter = ColorFilter.tint(color = Color.Blue)
            )
            Image(
                painter = painterResource(R.drawable.ic_jetnews_wordmark),
                contentDescription = null,
                colorFilter = ColorFilter.tint(color = Color.Blue)
            )
        }
    }


}