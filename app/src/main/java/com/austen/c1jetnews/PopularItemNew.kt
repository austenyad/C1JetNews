package com.austen.c1jetnews

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun PopularSection(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(start = 16.dp, end = 16.dp, top = 14.dp)) {
        Text("Popular on Jetnews", fontSize = 18.sp)
        Spacer(Modifier.height(12.dp))
        Row(
            modifier = Modifier.horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            PopularItemNew()
            PopularItemNew()
            PopularItemNew()
        }
        Spacer(Modifier.height(16.dp))
        HorizontalDivider(color = Color(0xFFEAE9EF))
    }
}

@Composable
fun PopularItemNew(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .width(226.dp)
            .clip(shape = RoundedCornerShape(4.dp))
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            painter = painterResource(R.drawable.ic_launcher_background),
            contentScale = ContentScale.Crop,
            contentDescription = null
        )
        Column(
            modifier = Modifier
                .background(color = Color(0xFFDFE1EE))
                .padding(vertical = 14.dp, horizontal = 16.dp)
        ) {
            Text(
                "Collections and sequences in kotlin",
                color = Color(0xFF3B3D4A),
                fontSize = 20.sp,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,

                )
            Text(
                "Florina Muntenscu", fontSize = 12.sp,
                lineHeight = 20.sp,
                letterSpacing = 0.2.sp
            )
            Text("July 24 - 4 min read", fontSize = 12.sp,
                lineHeight = 16.sp,
                letterSpacing = 0.4.sp)
        }


    }

}

@Preview(showBackground = false)
@Composable
private fun PopularItemNewPreview() {
    PopularItemNew()
}


