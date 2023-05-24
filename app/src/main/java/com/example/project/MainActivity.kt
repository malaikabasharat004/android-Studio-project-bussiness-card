package com.example.project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project.ui.theme.ProjectTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjectTheme{
                Surface(
                    modifier = Modifier.fillMaxSize()
                ){
                    Assignment1_004()
                }
            }
        }
    }
}

@Composable
fun Assignment1_004() {
    Column(
        modifier = Modifier
            .fillMaxSize().background(Color(54,69,79)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 120.dp)
        ){
            Column(horizontalAlignment = Alignment.CenterHorizontally)
            {
                val image= painterResource(id = R.drawable.android)
                Image(painter = image, contentDescription = null,modifier=Modifier.padding(16.dp))

                Text(
                    text = "Malaika Basharat",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 35.sp,
                    modifier = Modifier.padding(top=30.dp)
                )
                Text(
                    "Android Developer",
                    fontSize = 20.sp,
                    color = Color(120,194,87)
                )
            }
        }
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 30.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Row(
                modifier = Modifier
                    .padding(bottom = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            )
            {
                Icon(
                    imageVector = Icons.Rounded.Email,
                    contentDescription = null,
                    tint = Color(120,194,87),
                    modifier = Modifier
                        .size(30.dp)
                        .padding(end = 5.dp)
                        .wrapContentWidth(Alignment.Start)
                )
                Text(text = "criticalangel786",
                    color = Color.White)
            }

            Row(
                modifier = Modifier
                    .padding(bottom = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = Icons.Rounded.Call,
                    contentDescription = null,
                    tint = Color(120,194,87),
                    modifier = Modifier
                        .size(30.dp)
                        .padding(end = 5.dp)
                        .wrapContentWidth(Alignment.Start)
                )
                Text(
                    text = "0321 836 9006",
                    color = Color.White
                )
            }

            Row(
                modifier = Modifier
                    .padding(bottom = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = Icons.Rounded.Share,
                    contentDescription = null,
                    tint = Color(120,194,87),
                    modifier = Modifier
                        .size(30.dp)
                        .padding(end = 5.dp)
                )
                Text(text = "malaika_basharat",
                    color = Color.White)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Assignment1Preview(){
    ProjectTheme {
        Assignment1_004()
    }
}