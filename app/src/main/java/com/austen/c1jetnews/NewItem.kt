package com.austen.c1jetnews

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun NewItem(modifier: Modifier = Modifier) {
    var isBookmarked by remember { mutableStateOf(false) }
    Column {
        Row {
            PostImage(modifier = Modifier.padding(16.dp))
            Column(
                modifier = Modifier
                    .weight(1F)
                    .padding(vertical = 10.dp)
            ) {
                PostTitle()
                AuthorAndReadTime()
            }

            IconToggleButton(
                checked = isBookmarked, onCheckedChange = {
                    isBookmarked = it
                },
                modifier = Modifier
                    .padding(vertical = 2.dp, horizontal = 6.dp)
            ) {
                Icon(
                    if (isBookmarked) painterResource(R.drawable.ic_bookmark) else
                        painterResource(R.drawable.ic_bookmark_outline),
                    contentDescription = null
                )
            }

        }
        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 14.dp),
            color = Color(0xFFEAE9EF)
        )
    }
}


@Composable
fun PostCardHistory(modifier: Modifier = Modifier) {
    Column {
        Row {
            PostImage(modifier = Modifier.padding(16.dp))
            Column(
                modifier = Modifier
                    .weight(1F)
                    .padding(vertical = 10.dp)
            ) {
                PostTitle()
                AuthorAndReadTime()
            }
            IconButton(onClick = {},modifier = Modifier
                .padding(vertical = 2.dp, horizontal = 6.dp) ) {
                Icon(
                    painterResource(R.drawable.ic_more_vert),
                    contentDescription = null
                )
            }
        }
        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 14.dp),
            color = Color(0xFFEAE9EF)
        )
    }
}

@Composable
private fun AuthorAndReadTime() {
    Text(
        "Pietro Maggi - 1 min read",
        color = Color(0xFF4F4E56),
        fontFamily = FontFamily.SansSerif,
        fontSize = 14.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 20.sp,
        letterSpacing = 0.2.sp,
    )
}

@Composable
private fun PostTitle() {
    Text(
        "A Little Thing about Android Module Paths",
        color = Color(0xFF414149),
        fontFamily = FontFamily.SansSerif,
        fontSize = 16.sp,
        maxLines = 3,
        lineHeight = 24.sp,
        letterSpacing = 0.2.sp,
        fontWeight = FontWeight.W500,
        overflow = TextOverflow.Ellipsis,
    )
}


@Composable
fun PostImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.ic_launcher_background),
        contentDescription = null,
        modifier = modifier
            .size(40.dp)
            .clip(RoundedCornerShape(8.dp))
    )
}

@Preview(showBackground = true)
@Composable
private fun PostCardHistoryPreview() {
    PostCardHistory()
}

@Preview(showBackground = true)
@Composable
private fun NewItemPreview() {
    NewItem()
}


@Preview(showBackground = false)
@Composable
private fun PostImagePreview() {
    PostImage()
}