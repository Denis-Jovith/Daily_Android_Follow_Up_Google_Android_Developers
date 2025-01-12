package com.example.daily_android_follow_up_kotlin



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.daily_android_follow_up_kotlin.ui.theme.Daily_Android_Follow_Up_KotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Daily_Android_Follow_Up_KotlinTheme {
                Surface(

                ) {
                    Timely()
                }
            }
        }
    }
}

@Composable
fun Timely() {
    var showTime = remember { mutableStateOf(true) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        if (showTime.value) {
            Text(
                "20",
                style = TextStyle(
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        } else {
            Text(
                "List of activities",
                style = TextStyle(
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }
        Spacer(Modifier.height(40.dp))
        Button(onClick = {showTime.value = !showTime.value}){
            Text(
                if(showTime.value) "Show activities" else "Show time", style = TextStyle(fontSize = 28.sp)
            )
    }

}
}


@Composable
@Preview(showBackground = true)
fun TimelyPreview() {
    Daily_Android_Follow_Up_KotlinTheme {
        Timely()
    }
}
