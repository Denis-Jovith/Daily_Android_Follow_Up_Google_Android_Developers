package com.example.daily_android_follow_up_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.daily_android_follow_up_kotlin.ui.theme.Daily_Android_Follow_Up_KotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Daily_Android_Follow_Up_KotlinTheme {
                Surface (

                ){
                    Timely()
                }
            }
        }
    }
}

@Composable
fun Timely(){

}


@Composable
@Preview(showBackground = true)
fun TimelyPreview() {
    Daily_Android_Follow_Up_KotlinTheme {
        Timely()
    }
}