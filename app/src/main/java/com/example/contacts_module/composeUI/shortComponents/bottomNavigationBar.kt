package com.example.contacts_module.composeUI.shortComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.contacts_module.R
import com.example.helpandsupporttcc.ui.theme.IconGrey

// Define the Poppins FontFamily
val PoppinsFontFamily = FontFamily(
    Font(R.font.poppins, FontWeight.Normal)
)

// Define the TextStyle for the bottom navigation items
val BottomNavItemTextStyle = TextStyle(
    fontFamily = PoppinsFontFamily,
    fontWeight = FontWeight.SemiBold, // 600 corresponds to SemiBold
    fontSize = 10.48.sp,
    lineHeight = 19.22.sp,
    letterSpacing = (-0.36).sp,
    textAlign = TextAlign.Center
)

// Define the TextStyle for the Workspace text
val WorkspaceTextStyle = TextStyle(
    fontFamily = PoppinsFontFamily,
    fontWeight = FontWeight.SemiBold, // Assuming you want the same weight
    fontSize = 12.sp, // As previously defined
    textAlign = TextAlign.Center,
    color = IconGrey // Use the imported IconGrey Color directly
)

@Composable
fun WorkspaceBottomNavigationBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth() // Make the width fill the maximum available width
            .height(112.dp)
            .padding(start = 15.dp, end = 15.dp, bottom = 20.dp) // Apply the specified padding
            .background(Color.Transparent) // Allow background to show through
    ) {
        // Rounded White Bottom Navigation Bar with Shadow
        Row(
            modifier = Modifier
                .width(361.dp) // Revert to the original width
                .height(78.dp)
                .padding(start = 14.dp) // Revert to the original padding
                .align(Alignment.BottomStart)
                .background(
                    Color.White,
                    shape = RoundedCornerShape(24.dp)
                )
                .zIndex(0f), // Ensure the Row is below the Column
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            BottomNavItem(
                modifier = Modifier,
                icon = painterResource(id = R.drawable.ic_shopping),
                text = "Shopping",
                textColor = IconGrey,
                iconColor = IconGrey
            )
            BottomNavItem(
                modifier = Modifier,
                icon = painterResource(id = R.drawable.ic_booking),
                text = "Booking",
                textColor = IconGrey,
                iconColor = IconGrey
            )
            Spacer(modifier = Modifier.width(64.57657623291016.dp)) // Revert to the original Spacer
            BottomNavItem(
                modifier = Modifier,
                icon = painterResource(id = R.drawable.ic_careers),
                text = "Careers",
                textColor = IconGrey,
                iconColor = IconGrey
            )
            BottomNavItem(
                modifier = Modifier,
                icon = painterResource(id = R.drawable.ic_finance),
                text = "Finance",
                textColor = IconGrey,
                iconColor = IconGrey
            )
        }

        // Centered Workspace Icon and Text - Shown above the Row
        Column(
            modifier = Modifier
                .width(64.57657623291016.dp)
                .wrapContentHeight()
                .align(Alignment.TopCenter)
                .zIndex(1f), // Ensure the Column is above the Row
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_workspace),
                contentDescription = stringResource(R.string.workspace),
                modifier = Modifier.size(64.dp),
                tint = Color.Unspecified // Prevent color tinting for Workspace icon
            )
            Text(
                text = stringResource(R.string.workspace),
                style = WorkspaceTextStyle, // Apply the Workspace TextStyle with IconGrey color
                modifier = Modifier.padding(top = 2.dp)
            )
        }
    }
}

@Composable
fun BottomNavItem(
    modifier: Modifier,
    icon: androidx.compose.ui.graphics.painter.Painter,
    text: String,
    textColor: Color,
    iconColor: Color
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            painter = icon,
            contentDescription = text,
            modifier = modifier.size(24.dp),
            tint = iconColor
        )
        Text(
            text = text,
            style = BottomNavItemTextStyle.copy(color = textColor),
            modifier = modifier
                .width(41.dp)
                .height(20.dp)
        )
    }
}

@Preview
@Composable
fun PreviewWorkspaceBottomNavigationBar() {
    WorkspaceBottomNavigationBar()
}