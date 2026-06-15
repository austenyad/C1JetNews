package com.austen.c1jetnews

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopNewItem(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(horizontal = 16.dp)) {
        Spacer(Modifier.height(22.dp))

        Text(
            "Top stories for you",
            fontSize = 13.sp,
            color = Color(0xFF4D4D55)
        )
        Spacer(Modifier.height(12.dp))
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .clip(shape = RoundedCornerShape(4.dp))
        )
        Spacer(Modifier.height(12.dp))
        Text(
            "Redesigning the\nAndroid Studio Logo",
            fontSize = 19.sp
        )

        Spacer(Modifier.height(6.dp))
        Text(
            "Android Studio Team",
            fontSize = 12.sp,
            color = Color(0xFF52525A),
            lineHeight = 20.sp,
            letterSpacing = 0.1.sp
        )
        Text(
            "May 10 - 5 min read",
            fontSize = 10.sp,
            color = Color(0xFF5E5D64),
            lineHeight = 16.sp,
            letterSpacing = 0.4.sp
        )
        Spacer(Modifier.height(13.dp))
        HorizontalDivider(color = Color(0xFFEAE9EF))
    }
}


@Preview(showBackground = true)
@Composable
private fun TopNewItemPreview() {
    TopNewItem()
}
