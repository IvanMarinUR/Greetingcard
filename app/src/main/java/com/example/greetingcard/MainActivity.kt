package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingCardTheme {
                    Card(
                        name = "Android",
                        modifier = Modifier
                    )
            }
        }
    }
}

@Composable
fun Card(name: String, modifier: Modifier = Modifier) {
    Column(modifier= modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally){
        Column(modifier=modifier.fillMaxWidth().padding(horizontal=10.dp,vertical=100.dp)){
            Image(
                painter = painterResource(R.drawable.face),
                "Foto",
                modifier = modifier.align(alignment = Alignment.CenterHorizontally).padding(10.dp)
            )

            Text(
                text = "Iván Marín Benítez", color=Color.Blue,
                fontSize = 40.sp,
                modifier = modifier.align(alignment = Alignment.CenterHorizontally).padding(10.dp)
            )
            Text(
                text = "Minecraft expert", color = Color.Magenta,
                modifier = modifier.align(alignment = Alignment.CenterHorizontally).padding(10.dp)
            )
        }
        Column(modifier=modifier.padding(horizontal = 10.dp, vertical = 30.dp),horizontalAlignment = Alignment.CenterHorizontally)
        {
            Row(modifier.align(alignment = Alignment.Start).padding(10.dp)){
                Text(
                    text="Telefono: ",
                    modifier = modifier.padding(horizontal = 10.dp)
                )
                Text(
                    text="611494747",
                    modifier = modifier.padding(horizontal = 10.dp)
                )
            }
            Row(modifier.align(alignment = Alignment.Start).padding(10.dp)){
                Text(
                    text="Social:",
                    modifier = modifier.padding(horizontal = 10.dp)
                )
                Text(
                    text="Xxivanmaringamer777",
                    modifier = modifier.padding(horizontal = 10.dp)
                )
            }
            Row(modifier.align(alignment = Alignment.Start).padding(10.dp)){
                Text(
                    text="gmail",
                    modifier = modifier.padding(horizontal = 10.dp)
                )
                Text(
                    text="ivanmarinclase@gmail.com",
                    modifier = modifier.padding(horizontal = 10.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        Card("Android")
    }
}