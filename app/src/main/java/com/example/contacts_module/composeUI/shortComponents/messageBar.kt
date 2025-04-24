package com.example.contacts_module.composeUI.shortComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mic
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contacts_module.R
import com.example.helpandsupporttcc.ui.theme.ColorPrimaryOrange
import com.example.helpandsupporttcc.ui.theme.MessageInputBackground

@Composable
fun MessageInputBoxHintWithIcons(
    modifier: Modifier = Modifier,
    backgroundColor: Color = MessageInputBackground,
    onEmojiClick: () -> Unit = {}, // Default empty lambda
    onTimerClick: () -> Unit = {}, // Default empty lambda
    onDocumentClick: () -> Unit = {}, // Default empty lambda
    onCameraClick: () -> Unit = {}, // Default empty lambda
    onMicClick: () -> Unit = {} // Default empty lambda
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .width(305.dp)
                .height(42.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(backgroundColor)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 8.dp, end = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start // Align items starting from the left
            ) {
                // First Icon (Emoji)
                var emojiTint by remember { mutableStateOf(Color.Gray) }
                Icon(
                    painter = painterResource(id = R.drawable.emoji_gray),
                    contentDescription = "Emoji Icon",
                    modifier = Modifier
                        .size(24.dp)
                        .clickable {
                            emojiTint = if (emojiTint == Color.Gray) ColorPrimaryOrange else Color.Gray
                            onEmojiClick() // Invoke the provided click listener
                        },
                    tint = emojiTint
                )

                // Add some spacing before the text
                Spacer(modifier = Modifier.width(17.dp))

                // Text Hint (not clickable in this implementation)
                Text(
                    text = "Write a message",
                    color = Color.Gray,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .weight(1f) // Let the text take the remaining horizontal space
                )

                // Icons with specific spacing (Timer)
                var timerTint by remember { mutableStateOf(Color.Gray) }
                Icon(
                    painter = painterResource(id = R.drawable.timer_svg),
                    contentDescription = "Timer Icon",
                    modifier = Modifier
                        .size(24.dp)
                        .clickable {
                            timerTint = if (timerTint == Color.Gray) ColorPrimaryOrange else Color.Gray
                            onTimerClick() // Invoke the provided click listener
                        },
                    tint = timerTint
                )
                Spacer(modifier = Modifier.width(10.dp)) // Spacing between icons

                // Icons with specific spacing (Document)
                var documentTint by remember { mutableStateOf(Color.Gray) }
                Icon(
                    painter = painterResource(id = R.drawable.document_svg),
                    contentDescription = "Document Icon",
                    modifier = Modifier
                        .size(24.dp)
                        .clickable {
                            documentTint = if (documentTint == Color.Gray) ColorPrimaryOrange else Color.Gray
                            onDocumentClick() // Invoke the provided click listener
                        },
                    tint = documentTint
                )
                Spacer(modifier = Modifier.width(10.dp)) // Spacing between icons

                // Icons with specific spacing (Camera)
                var cameraTint by remember { mutableStateOf(Color.Gray) }
                Icon(
                    painter = painterResource(id = R.drawable.camera_icon),
                    contentDescription = "Camera Icon",
                    modifier = Modifier
                        .size(24.dp)
                        .clickable { onCameraClick() }, // Invoke the provided click listener
                    tint = cameraTint
                )
            }
        }

        // Spacer for the 4dp gap
        Spacer(modifier = Modifier.width(4.dp))

        // Microphone Button
        Box(
            modifier = Modifier
                .size(41.dp)
                .clip(CircleShape)
                .background(ColorPrimaryOrange)
                .clickable { onMicClick() }, // Invoke the provided click listener
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Filled.Mic,
                contentDescription = "Microphone Icon",
                tint = Color.White, // You might want a different color for the icon
                modifier = Modifier.padding(8.2.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MessageInputBoxHintWithIconsPreview() {
    // Assuming you have ColorPrimaryOrange defined in your theme
    MessageInputBoxHintWithIcons(
        onEmojiClick = { println("Emoji Clicked") },
        onTimerClick = { println("Timer Clicked") },
        onDocumentClick = { println("Document Clicked") },
        onCameraClick = { println("Camera Clicked") },
        onMicClick = { println("Mic Clicked") }
    )
}