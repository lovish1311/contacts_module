package com.example.contacts_module.composeUI.shortComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.helpandsupporttcc.ui.theme.ColorWhite

@Composable
fun RoundedCornerBox() {
    Box(
        modifier = Modifier
            .width(350.dp)
            .height(75.dp)
            .background(
                color = ColorWhite,
                shape = RoundedCornerShape(10.dp)
            )
            .padding(16.dp), // Padding inside the box
        contentAlignment = Alignment.CenterStart // Adjust alignment as needed
    ) {
        // Add your elements here within this Box

        // Example elements:
        Text(text = "Element 1", modifier = Modifier.padding(end = 8.dp))
        Spacer(modifier = Modifier.width(8.dp)) // Add some spacing between elements
        Text(text = "Element 2")
        // You can add more elements and use different Composables
        // like Row or Column inside this Box for more complex layouts.
    }
}

// Preview function (optional)
@Preview
@Composable
fun PreviewRoundedCornerBox() {
    RoundedCornerBox()
}