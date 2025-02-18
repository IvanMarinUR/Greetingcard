package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier= modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        Column(){
            Text(
                text = "FOTO",
                fontSize = 50.sp,
                modifier = modifier.align(alignment = Alignment.CenterHorizontally)
            )

            Text(
                text = "Iván Marín Benítez",
                fontSize = 40.sp,
                modifier = modifier.align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                text = "Minecraft expert",
                modifier = modifier.align(alignment = Alignment.CenterHorizontally)
            )
        }
        Column()
        {
            Row(){
                Text(
                    text="foto",
                    modifier = modifier
                )
                Text(
                    text="numero telefono",
                    modifier = modifier
                )
            }
            Row(){
                Text(
                    text="foto",
                    modifier = modifier
                )
                Text(
                    text="social media",
                    modifier = modifier
                )
            }
            Row(){
                Text(
                    text="foto",
                    modifier = modifier
                )
                Text(
                    text="dirección gmail",
                    modifier = modifier
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        Greeting("Android")
    }
}