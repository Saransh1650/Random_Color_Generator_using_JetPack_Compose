package com.example.first_composeapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.first_composeapp.ui.theme.First_composeAppTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            colorBox(
                Modifier
            )
            }
        }
    }



@Composable
fun colorBox(modifier: Modifier = Modifier){
    val color1 = remember {
        mutableStateOf(Color.Yellow)
    }
    val color2 = remember {
        mutableStateOf(Color.Green)
    }

    Column {
        Box(modifier = modifier.
            size(height = 100.dp, width = 1000.dp)
            .background(color1.value)
            .clickable {
                color1.value = Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1F
                )
            }
        )
        Box(modifier = modifier.
                    size(width = 1000.dp, height = 1000.dp)
                    .background(color2.value)
                    .clickable {
                        color2.value = Color(
                            Random.nextFloat(),
                            Random.nextFloat(),
                            Random.nextFloat(),
                            1F
                        )
                    }
                )


    }
}




@Preview
@Composable
fun First_composeApp(){
    colorBox(Modifier)
}