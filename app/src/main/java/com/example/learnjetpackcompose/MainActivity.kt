package com.example.learnjetpackcompose

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontSynthesis.Companion.Style
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learnjetpackcompose.ui.theme.LearnJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column {
                Column(

                    modifier = Modifier
                        .background(Color.Green)
                        .width(200.dp)
                        .height(200.dp),
                    verticalArrangement = Arrangement.Center,

                    ) {

                    Text("This is Column",Modifier.offset(20.dp), style = TextStyle(fontFamily = FontFamily.Monospace))
                    Text("Welcome to Jetpack Compose")
                    Text("Thank You Sabuj")
                }

                Row(
                    modifier = Modifier
                        .background(Color.Blue)
                        .width(200.dp)
                        .height(200.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Text1")
                    Text("Text2")
                    Text("Text3")
                }

            }
        }
    }
}

