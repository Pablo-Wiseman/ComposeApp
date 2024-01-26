package com.example.composeapp.ui.theme

import android.widget.Button
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.R

@Preview
@Composable
fun ProfileCard() {
    Card(
        Modifier
            .padding(10.dp),
        shape = RoundedCornerShape(
            topStart = 8.dp,
            topEnd = 8.dp
        ),
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.background),
        border = BorderStroke(2.dp, MaterialTheme.colorScheme.onBackground)
    ) {
        Column(
            Modifier
                .padding(8.dp)
        ) {

            Row(
                Modifier
                    .background(MaterialTheme.colorScheme.background)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround

            ) {
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.discord),
                    contentDescription = "",
                    Modifier
                        .size(70.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .padding(10.dp)
                )

                UserStatistics("6,950", "Posts")
                UserStatistics("436", "Followers")
                UserStatistics("76", "Following")
            }
            Column(
                Modifier
                    .padding(10.dp, 0.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(top = 10.dp),
                    fontFamily = FontFamily.Cursive,
                    fontSize = 30.sp,
                    fontStyle = FontStyle.Normal,
                    text = "Discord",
                )
                Text(
                    fontSize = 12.sp,
                    text = "#YoursToMake",
                )
                Text(
                    fontSize = 12.sp,
                    text = "www.discord.com/emotional_health",
                )
                Button(
                    contentPadding = PaddingValues(start = 25.dp, end = 25.dp, top = 0.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Text(
                        text = "Follow"
                    )
                }

            }
        }
    }
}

@Composable
fun UserStatistics(
    value: String,
    title: String
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            fontFamily = FontFamily.Serif,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            text = value
        )
        Text(
            fontWeight = FontWeight.Bold,
            text = title
        )

    }
}
