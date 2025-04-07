package com.example.contacts_module.composeUI.shortComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contacts_module.R
import com.example.helpandsupporttcc.ui.theme.ColorPrimary
import com.example.helpandsupporttcc.ui.theme.lightOrange

@Composable
fun OrangeBoxScheduleTimer(
    text: String,
    iconId: Int,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .width(150.dp)
            .height(36.dp)
            .background(lightOrange, RoundedCornerShape(8.dp))
            .border(1.dp, ColorPrimary, RoundedCornerShape(8.dp)) // Added border here
            .clickable(onClick = onClick),
        contentAlignment = Alignment.CenterStart
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 10.dp, top = 8.dp, bottom = 8.dp, end = 0.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = iconId),
                contentDescription = text,
                tint = Color.Unspecified,
                modifier = Modifier
                    .width(22.dp)
                    .height(22.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = text,
                style = TextStyle(
                    fontSize = 10.sp,
                    color = Color(0xFFF84C10),
                    lineHeight = 20.sp
                ),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview
@Composable
fun PreviewOrangeBoxScheduleTimer() {
    // Example usage of the reusable composable
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        OrangeBoxScheduleTimer(
            text = "Disappearing Message",
            iconId = R.drawable.ic_timer_orange,
            onClick = {
                println("First box clicked")
            }
        )
        OrangeBoxScheduleTimer(
            text = "Reminder Set",
            iconId = R.drawable.ic_schedule_time_orange, // Replace with a different icon
            onClick = {
                println("Second box clicked")
            }
        )
    }
}