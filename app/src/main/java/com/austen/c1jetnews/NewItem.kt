package com.austen.c1jetnews

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun NewItem(modifier: Modifier = Modifier) {


    Row(modifier = modifier) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_background), contentDescription = null,
            Modifier.size(50.dp)
                .padding(top = 10.dp)
        )


        Spacer(Modifier.width(10.dp))
        Column {
            Text(
                "A Little Thing about Android Module Paths",
                fontSize = 16.sp,
                modifier = Modifier.width(160.dp)
            )

            Text(
                "Pietro Maggi - 1 min read",
                fontSize = 12.sp,
                modifier = Modifier.width(160.dp)
            )
        }

        Spacer(Modifier.weight(1F))



        Image(
            painter = painterResource(R.drawable.ic_bookmark_outline),
            contentDescription = null,
            colorFilter = ColorFilter.tint(Color.Black),
            modifier = Modifier.padding(top = 10.dp)
        )

    }
}


@Preview(showBackground = true)
@Composable
private fun NewItemPreview() {
    NewItem()
}