package com.example.contacts_module.composeUI.shortComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contacts_module.R
import com.example.helpandsupporttcc.ui.theme.lightOrange

@Composable
fun MessageBackgroundItem(message: String, seenStatusIconId: Int) {
    Box(
        modifier = Modifier
            .wrapContentWidth() // Width wraps content
            .wrapContentHeight() // Height wraps content
            .background(lightOrange, RoundedCornerShape(20.dp))
            .padding(8.dp) // Add some padding around the message
    ) {
        Column(horizontalAlignment = Alignment.End) { // Align content to the end for the status
            Text(
                text = message,
                color = Color.Black, // Adjust text color as needed
                fontSize = 16.sp,
                modifier = Modifier.fillMaxWidth()
            )
            Row(
                modifier = Modifier
                    .width(49.dp) // Changed width to 49dp
                    .height(12.dp)
                    .padding(end = 11.39.dp, bottom = 13.dp), // Swapped padding values
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                androidx.compose.foundation.Image(
                    painter = painterResource(id = seenStatusIconId),
                    contentDescription = "Seen Status",
                    modifier = Modifier.size(12.dp) // Adjust image size as needed
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "14:12",
                    color = Color.Gray, // Adjust color as needed
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

// Preview function (optional)
@androidx.compose.ui.tooling.preview.Preview(showBackground = true, widthDp = 400, heightDp = 200)
@Composable
fun PreviewMessageBackgroundItem() {
    MessageBackgroundItem(
        message = "Hello, how are you doing today? This is a longer message to test the wrapping of content.",
        seenStatusIconId = R.drawable.double_tick
    ) // Replace with your actual drawable resource
}