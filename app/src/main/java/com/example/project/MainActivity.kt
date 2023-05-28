package com.example.project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project.ui.theme.ProductSans
import com.example.project.ui.theme.ProjectTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjectTheme{
                Assignment1_004()
            }
        }
    }
}

@Composable
fun Assignment1_004() {

    //Column Layout for Whole Screen Area
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(210, 232, 212))
    ) {

        // Making variables for colors that will use again and again
        val colorGreen = Color(0, 109, 59)  //Green color for text and icons
        val imageBg = Color(7, 48, 66)      //Setting Image Background as Blue
        val image= painterResource(id = R.drawable.android_logo)  //Setting Image resource for logo

        //Adding Image Logo
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .background(imageBg)
                .size(150.dp, 150.dp)
                .padding(20.dp)
        )

        //Adding Height Space
        Spacer(modifier = Modifier.height(10.dp))

        //Displaying Name Behind Logo
        Text(
            text = stringResource(R.string.name),
            fontSize = 40.sp,
            fontWeight = FontWeight.Thin,
            fontFamily = ProductSans,
        )

        //Adding Height Space
        Spacer(modifier = Modifier.height(15.dp))

        //Displaying Expertise
        Text(
            text = "Android Developer Extraordinaire",
            color = colorGreen,
            fontWeight = FontWeight.Bold,
            fontSize = 19.sp
        )

        //Adding Height Space
        Spacer(modifier = Modifier.height(200.dp))

        //Adding Row in Column
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(10.dp)
        ) {

            //Adding Icon and Text
            Icon(
                imageVector = Icons.Rounded.Call,
                contentDescription = null,
                tint = colorGreen,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = stringResource(R.string.contact),
                color = colorGreen,
                modifier = Modifier.weight(2f)
            )
        }

        //Adding Row in Column
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(10.dp)
        ) {

            //Adding Icon and Text
            Icon(
                imageVector = Icons.Rounded.Email,
                contentDescription = null,
                tint = colorGreen,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = stringResource(R.string.email),
                color = colorGreen,
                modifier = Modifier.weight(2f)
            )
        }

        //Adding Row in Column
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(10.dp)
        ) {

            //Adding Icon and Text
            Icon(
                imageVector = Icons.Rounded.Share,
                contentDescription = null,
                tint = colorGreen,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = stringResource(R.string.tweet),
                color = colorGreen,
                modifier = Modifier.weight(2f)
            )
        }

        //Adding Space Behind Row
        Spacer(modifier=Modifier.height(30.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun Assignment1Preview(){
    ProjectTheme {
        Assignment1_004()
    }
}
//buttons Button(onClick = { /*TODO*/ },
//            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0XFF0F9D58)),
//        ) {
//            Text("Button 1", color = Color.White)
//        }

//package com.example.project
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxHeight
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.material.icons.Icons
//import
// androidx.compose.material.icons.rounded.Email
//import androidx.compose.material.icons.rounded.Phone
//import androidx.compose.material.icons.rounded.Share
//import androidx.compose.material3.Icon
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.project.ui.theme.ProjectTheme
//
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            ProjectTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background,
//                ) {
//                    Greeting("Android")
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//
//    Column(
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color(red = 0xCD, green = 0xDC, blue = 0x39, alpha = 0xFF))
//    ) {
//        Spacer(
//            Modifier
//                .weight(4f)
//                .fillMaxHeight()
//                .background(Color.Green))
////        profile block
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.androidparty1),
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .size(150.dp)
//                    .clip(CircleShape)
//            )
//            Text(
//                text = "Malaika Basharat",
//                fontSize = 40.sp,
//                fontWeight = FontWeight.Light,
//                modifier = Modifier.padding(top = 8.dp)
//            )
//            Text(
//                text = "Android App Developer",
//                fontSize = 15.sp,
//                fontWeight = FontWeight.Bold,
//                color = Color(red = 0x00, green = 0x45, blue = 0xB5)
//            )
//        }
//        Spacer(
//            Modifier
//                .weight(3f)
//                .fillMaxHeight()
//                .background(Color.Green))
////        contact info block
//        Column(
//            verticalArrangement = Arrangement.Bottom,
//            modifier = Modifier.padding(bottom = 20.dp)
//        ) {
//            Row(
//                horizontalArrangement = Arrangement.Center,
//                modifier = Modifier.padding(bottom = 6.dp)
//            ) {
//                Icon(
//                    Icons.Rounded.Phone,
//                    tint = Color(red = 0x00, green = 0x45, blue = 0xB5),
//                    contentDescription = null,
//                    modifier = Modifier
//                        .padding(end = 8.dp)
//                        .size(20.dp)
//                )
//                Text("+92 321 836 9006")
//            }
//            Row(
//                modifier = Modifier.padding(bottom = 6.dp)
//            ) {
//                Icon(
//                    Icons.Rounded.Share,
//                    tint = Color(red = 0x00, green = 0x45, blue = 0xB5),
//                    contentDescription = null,
//                    modifier = Modifier
//                        .padding(end = 8.dp)
//                        .size(20.dp)
//                )
//                Text("@malaika_basharat_89")
//            }
//            Row {
//                Icon(
//                    Icons.Rounded.Email,
//                    tint = Color(red = 0x00, green = 0x45, blue = 0xB5),
//                    contentDescription = null,
//                    modifier = Modifier
//                        .padding(end = 8.dp)
//                        .size(20.dp)
//                )
//                Text("criticalangel786@gmail.com")
//            }
//        }
//    }
//
//}
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() = ProjectTheme {
//    Greeting("Android")
//}







//    Column(
//        modifier = Modifier
//            .fillMaxSize().background(Color(210,232,212)),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally)
//    {
//        Box(
//            contentAlignment = Alignment.Center,
//            modifier = Modifier
//                .fillMaxSize()
//        ){
//            Column(horizontalAlignment = Alignment.CenterHorizontally)
//            {
//                val image= painterResource(id = R.drawable.android_logo)
//                Image(painter = image, contentDescription = null,modifier=Modifier.size(150.dp,150.dp).padding(16.dp).background(Color(7,48,66)))
//
//                Text(
//                    text = "Malaika Basharat",
//                    fontSize = 40.sp,
//                )
//                Text(
//                    "Android Developer",
//                    fontSize = 20.sp,
//                    color = Color(0,109,59)
//                )
//            }
//        }
//        Column(modifier = Modifier
//            .fillMaxSize()
//            .padding(bottom = 30.dp),
//            verticalArrangement = Arrangement.Bottom,
//            horizontalAlignment = Alignment.CenterHorizontally)
//        {
//            Row(
//                modifier = Modifier
//                    .padding(bottom = 10.dp),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.Center
//            )
//            {
//                Icon(
//                    imageVector = Icons.Rounded.Email,
//                    contentDescription = null,
//                    tint = Color(0,109,59),
//                    modifier = Modifier
//                        .size(30.dp)
//                        .padding(end = 5.dp)
//                        .wrapContentWidth(Alignment.Start)
//                )
//                Text(text = "malaika@android.com")
//            }
//
//            Row(
//                modifier = Modifier
//                    .padding(bottom = 10.dp),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.Center
//            ) {
//                Icon(
//                    imageVector = Icons.Rounded.Call,
//                    contentDescription = null,
//                    tint = Color(0,109,59),
//                    modifier = Modifier
//                        .size(30.dp)
//                        .padding(end = 5.dp)
//                        .wrapContentWidth(Alignment.Start)
//                )
//                Text(
//                    text = "+92321 8369006")
//            }
//
//            Row(
//                modifier = Modifier
//                    .padding(bottom = 10.dp),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.Center
//            ) {
//                Icon(
//                    imageVector = Icons.Rounded.Share,
//                    contentDescription = null,
//                    tint = Color(0,109,59),
//                    modifier = Modifier
//                        .size(30.dp)
//                        .padding(end = 5.dp)
//                )
//                Text(text = "malaika_basharat")
//            }
//        }
//    }
