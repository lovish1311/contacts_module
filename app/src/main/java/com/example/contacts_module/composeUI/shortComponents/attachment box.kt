package com.example.contacts_module.composeUI.shortComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contacts_module.R

@Preview
@Composable
fun AttachmentBox() {
    val icons = listOf(
        R.drawable.gallery_icon to "Gallery",
        R.drawable.ic_document to "Document",
        R.drawable.ic_location to "Location",
        R.drawable.ic_contact to "Contact",
        R.drawable.ic_poll to "Poll",
        R.drawable.ic_event to "Event",
        R.drawable.ic_audio to "Audio"
    )

    Column(
        modifier = Modifier
            .width(350.dp)
            .height(138.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(Color.White)
    ) {
        // First Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, start = 24.dp)
        ) {
            IconWithText(icons[0].first, icons[0].second)
            Spacer(modifier = Modifier.width(24.dp)) // Changed to 24.dp
            IconWithText(icons[1].first, icons[1].second)
            Spacer(modifier = Modifier.width(24.dp)) // Changed to 24.dp
            IconWithText(icons[2].first, icons[2].second)
            Spacer(modifier = Modifier.width(24.dp)) // Changed to 24.dp
            IconWithText(icons[3].first, icons[3].second)
            Spacer(modifier = Modifier.width(24.dp)) // Changed to 24.dp
            IconWithText(icons[4].first, icons[4].second)
        }
        // Spacer between rows
        Spacer(modifier = Modifier.height(20.dp)) // Added 24dp spacing between rows

        // Second Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 26.dp) // Removed bottom padding
        ) {
            IconWithText(icons[5].first, icons[5].second)
            Spacer(modifier = Modifier.width(42.dp)) // Changed to 24.dp
            IconWithText(icons[6].first, icons[6].second)
        }
    }
}

@Composable
fun IconWithText(iconRes: Int, text: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = text,
            modifier = Modifier.size(24.dp)
        )
        Text(
            text = text,
            fontSize = 12.sp,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}