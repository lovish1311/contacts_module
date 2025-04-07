package com.example.contacts_module.composeUI

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.contacts_module.R
import com.example.helpandsupporttcc.ui.theme.BoxColor1
import com.example.helpandsupporttcc.ui.theme.ColorPrimary
import com.example.helpandsupporttcc.ui.theme.TextColor4
@Preview(showBackground = true)
@Composable
fun MyRelativeLayout() {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
    ) {
        val (header, body, footer) = createRefs()

        Header(
            modifier = Modifier.constrainAs(header) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )

        Body(
            modifier = Modifier.constrainAs(body) {
                top.linkTo(header.bottom)
                bottom.linkTo(footer.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )

        Footer(
            modifier = Modifier.constrainAs(footer) {
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )
    }
}

@Composable
fun Header(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier = modifier
            .fillMaxWidth()
            .height(126.dp)
            .background(ColorPrimary)
    ) {
        val (backArrow, profileImage, name, onlineStatus, iconsRow) = createRefs()

        Image(
            painter = painterResource(id = R.drawable.baseline_arrow_back_ios_24),
            contentDescription = null,
            modifier = Modifier
                .width(9.dp)
                .height(15.dp)
                .constrainAs(backArrow) {
                    start.linkTo(parent.start, 22.dp)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
        )

        Image(
            painter = painterResource(id = R.drawable.profile_png),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(45.dp)
                .clip(CircleShape)
                .constrainAs(profileImage) {
                    start.linkTo(backArrow.end, 15.dp)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
        )

        Text(
            text = "Prashant Bagahi",
            color = Color.White,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.constrainAs(name) {
                start.linkTo(profileImage.end, 6.dp)
                top.linkTo(profileImage.top, 5.dp)
            }
        )

        Text(
            text = "Online",
            color = Color.White,
            fontSize = 12.sp,
            modifier = Modifier.constrainAs(onlineStatus) {
                start.linkTo(name.start)
                top.linkTo(name.bottom)
            }
        )

        Row(
            modifier = Modifier.constrainAs(iconsRow) {
                end.linkTo(parent.end, 22.dp)
                top.linkTo(name.top)
                bottom.linkTo(name.bottom)
            }
        ) {
            Image(
                painter = painterResource(id = R.drawable.ruppee),
                contentDescription = null,
                modifier = Modifier
                    .size(18.dp)
                    .padding(horizontal = 20.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.mynaui_video),
                contentDescription = null,
                modifier = Modifier
                    .size(22.dp)
                    .padding(horizontal = 20.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.call_icon),
                contentDescription = null,
                modifier = Modifier
                    .size(19.dp)
                    .padding(horizontal = 20.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.three_dot),
                contentDescription = null,
                modifier = Modifier
                    .size(23.dp)
                    .padding(horizontal = 20.dp)
            )
        }
    }
}

@Composable
fun Body(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(Color(0xFFFFFFFF))
    ) {
        Text(
            text = "Today",
            color = Color.Black,
            fontSize = 9.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(BoxColor1)
                .align(Alignment.Center)
                .padding(10.dp)
        )
    }
}

@Composable
fun Footer(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier = modifier
            .fillMaxWidth()
            .height(720.dp)
            .background(Color(0xFFFFFFFF))
    ) {
        val (msgBox, micIcon) = createRefs()

        Row(
            modifier = Modifier
                .background(TextColor4)
                .fillMaxWidth()
                .height(42.dp)
                .constrainAs(msgBox) {
                    bottom.linkTo(parent.bottom, 17.dp)
                    start.linkTo(parent.start, 20.dp)
                }
        ) {
            Image(
                painter = painterResource(id = R.drawable.emoji_gray),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
                    .padding(9.dp)
            )
            Text(
                text = "Write a message",
                color = Color.Gray,
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(9.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(id = R.drawable.timer_svg),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
                    .padding(9.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.document_svg),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
                    .padding(9.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.camera_icon),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
                    .padding(9.dp)
            )
        }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(41.dp)
                .background(ColorPrimary)
                .constrainAs(micIcon) {
                    end.linkTo(parent.end, 4.dp)
                    top.linkTo(msgBox.top)
                    bottom.linkTo(msgBox.bottom)
                }
        ) {
            Image(
                painter = painterResource(id = R.drawable.baseline_mic_24),
                contentDescription = null,
                modifier = Modifier.size(28.dp)
            )
        }
    }
}
