package com.austen.c1jetnews

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun PopularSection(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text("Popular on Jetnews")
        Row(
            modifier = Modifier.horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            PopularItemNew()
            PopularItemNew()
            PopularItemNew()
        }
    }
}

@Composable
fun PopularItemNew(modifier: Modifier = Modifier) {

    Column(modifier = modifier.width(160.dp)) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            painter = painterResource(R.drawable.ic_launcher_background),
            contentScale = ContentScale.Crop,
            contentDescription = null
        )
        Text(
            "Collections and sequences in kotlin",
            fontSize = 18.sp,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        Text("Florina Muntenscu")
        Text("July 24 - 4 min read")

    }

}

@Preview(showBackground = true)
@Composable
private fun PopularItemNewPreview() {
    PopularItemNew()
}


