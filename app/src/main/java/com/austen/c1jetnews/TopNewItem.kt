package com.austen.c1jetnews

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopNewItem(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text("Top stories for you", fontSize = 12.sp)
        Spacer(Modifier.height(10.dp))
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .clip(shape = RoundedCornerShape(4.dp))
        )
        Text(
            "Redesigning the\nAndroid Studio Logo",
            fontSize = 16.sp
        )
        Spacer(Modifier.height(10.dp))
        Text("Android Studio Team", fontSize = 12.sp)
        Text("May 10 - 5 min read", fontSize = 10.sp)
    }
}


@Preview(showBackground = true)
@Composable
private fun TopNewItemPreview() {
    TopNewItem()
}
