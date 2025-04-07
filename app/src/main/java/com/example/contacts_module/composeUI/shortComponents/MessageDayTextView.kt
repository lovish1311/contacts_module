package com.example.contacts_module.composeUI.shortComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contacts_module.R

// Declare the Inter font family
val InterFontFamily = FontFamily(
    Font(R.font.inter_medium, FontWeight.Medium)
    // You can add other weights here if needed, e.g.,
    // Font(R.font.inter_regular, FontWeight.Normal),
    // Font(R.font.inter_bold, FontWeight.Bold)
)

@Composable
fun MessageDayTextView(text: String) {
    Box(
        modifier = Modifier
            .width(88.dp)
            .height(18.dp)
            .background(
                color = Color(0xFFD3D3D3), // Replace with your desired gray color
                shape = RoundedCornerShape(20.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            fontSize = 9.sp,
            fontFamily = InterFontFamily, // Use the declared FontFamily
            textAlign = TextAlign.Center,
            lineHeight = 20.sp,
            style = TextStyle(fontWeight = FontWeight.Medium) // Optionally set fontWeight in TextStyle
        )
    }
}

// Preview messagedaytextview
@Preview(showBackground = true)
@Composable
fun MessageDayTextViewPreview() {
    MessageDayTextView(text = "Today")
}