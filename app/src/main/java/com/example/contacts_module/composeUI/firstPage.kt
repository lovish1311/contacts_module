import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.contacts_module.R
import com.example.helpandsupporttcc.ui.theme.ColorPrimary

@Composable
fun ConversationScreenOptimized() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        // Create references for the composables
        val topBar = createRef()
        val bottomBox = createRef()

        // Top Bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(126.dp)
                .background(ColorPrimary)
                .constrainAs(topBar) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBackIos,
                contentDescription = "Back",
                tint = Color.White,
                modifier = Modifier.padding(start = 22.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))
            Image(
                painter = painterResource(id = R.drawable.profile_png),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(45.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(6.dp))
            Column {
                Text(
                    text = "Prashant Bagahi",
                    color = Color.White,
                    fontSize = 14.sp,
                    lineHeight = 16.41.sp,
                    style = TextStyle(textAlign = TextAlign.Center),
                    modifier = Modifier.padding(top = 5.dp)
                )
                Text(
                    text = "Online",
                    color = Color.White,
                    fontSize = 12.sp,
                    lineHeight = 20.sp
                )
            }
            Spacer(modifier = Modifier.width(34.dp))
            Image(
                painter = painterResource(id = R.drawable.ruppee),
                contentDescription = "Rupee",
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Image(
                painter = painterResource(id = R.drawable.mynaui_video),
                contentDescription = "Video Call",
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Image(
                painter = painterResource(id = R.drawable.call_icon),
                contentDescription = "Call",
                modifier = Modifier.size(19.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Image(
                painter = painterResource(id = R.drawable.three_dot),
                contentDescription = "More Options",
                modifier = Modifier.size(width = 19.dp, height = 23.dp)
            )
        }

        // Bottom Box with Rounded Corners
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(bottomBox) {
                    top.linkTo(topBar.bottom, margin = (-30).dp) // Overlap the top bar
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    height = Dimension.fillToConstraints
                }
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 30.dp,
                        bottomStart = 0.dp,
                        bottomEnd = 0.dp
                    )
                )
        ) {
            // Your layout for the bottom content goes here
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ConversationScreenOptimizedPreview() {
    ConversationScreenOptimized()
}