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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contacts_module.R
import com.example.helpandsupporttcc.ui.theme.NavyBlue
import com.example.helpandsupporttcc.ui.theme.TextColor1
import com.example.helpandsupporttcc.ui.theme.lightOrange

@Composable
fun MessageBackgroundItem(message: String, seenStatusIconId: Int, date: String) {
    Box(
        modifier = Modifier
            .wrapContentWidth() // Width wraps content
            .wrapContentHeight() // Height wraps content
            .background(lightOrange, RoundedCornerShape(20.dp,20.dp,20.dp,0.dp))
            .padding(8.dp,8.dp,11.39.dp,13.dp) // Add some padding around the message
    ) {
        Column(horizontalAlignment = Alignment.End) { // Align content to the end for the status
            Text(
                text = message,
                color = NavyBlue, // Adjust text color as needed
                fontSize = 16.sp,
                modifier = Modifier.fillMaxWidth()
            )




        }
        seenStatusAndDate(seenStatusIconId,date,Modifier.align(Alignment.BottomEnd))
//        seenStatusAndDate(R.drawable.double_tick,"14.22")
    }
}
@Composable
fun seenStatusAndDate(seenStatusIconId: Int, date: String,modifier: Modifier){
    Row(
        modifier = modifier
            .width(49.dp) // Changed width to 49dp
            .height(12.dp),
        horizontalArrangement = Arrangement.Start
    ) {
        androidx.compose.foundation.Image(
            painter = painterResource(id = seenStatusIconId),
            contentDescription = "Seen Status",
            modifier = Modifier.size(12.dp) // Adjust image size as needed
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = date,
            color = TextColor1, // Adjust color as needed
            fontSize = 10.sp,
            fontFamily = InterFontFamily,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.End
        )
    }
}
// Preview function (optional)
@androidx.compose.ui.tooling.preview.Preview(showBackground = true, widthDp = 400, heightDp = 200)
@Composable
fun PreviewMessageBackgroundItem() {
    MessageBackgroundItem(
        message = "Hello, how are you doing today? This is a longer message to test the wrapping of content.",
        seenStatusIconId = R.drawable.double_tick,
        date = "14.22"
    ) // Replace with your actual drawable resource
}
