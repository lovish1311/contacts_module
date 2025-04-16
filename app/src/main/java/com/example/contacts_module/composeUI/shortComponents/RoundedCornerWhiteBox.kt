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
fun RoundedCornerBox(width:Int,height:Int,content:@Composable () -> Unit) {
    Box(
        modifier = Modifier
            .width(width.dp)
            .height(height.dp)
            .background(
                color = ColorWhite,
                shape = RoundedCornerShape(10.dp)
            )
            .padding(16.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        content

    }
}


@Preview
@Composable
fun PreviewRoundedCornerBox() {
    RoundedCornerBox(350,190, content = {
        Text(text = "Hello, this is a preview of a rounded corner box!")

    })
}