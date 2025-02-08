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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.daily_android_follow_up_kotlin.model.Affirmation
import com.example.daily_android_follow_up_kotlin.ui.theme.Daily_Android_Follow_Up_KotlinTheme

class MustApp1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {

            val mustUniveristyController = rememberNavController()

            NavHost(
                navController = mustUniveristyController,
                startDestination = "collages",
                modifier = Modifier
            ){
                composable(route = "collages") {
                    CollegeScreen(navController = mustUniveristyController)
                }
                composable(route = "coict") {
                    CoICTScreen(navController = mustUniveristyController)
                }
                composable(route = "cse") {
                    CSEScreen()
                }
            }
        }
    }
}

@Composable
fun CollegeScreen (navController: NavController ){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Mbeya University",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigate("coict") }, modifier = Modifier.width(300.dp)) {
            Text("CoICT", fontSize = 28.sp, modifier = Modifier.padding(horizontal = 50.dp))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {}, modifier = Modifier.width(300.dp)) {
            Text("CoSTE", fontSize = 28.sp, modifier = Modifier.padding(horizontal = 50.dp))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {}, modifier = Modifier.width(300.dp)) {
            Text("CoACT", fontSize = 28.sp, modifier = Modifier.padding(horizontal = 50.dp))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {},
            modifier = Modifier.width(300.dp)) {
            Text("CET", fontSize = 28.sp, modifier = Modifier.padding(horizontal = 50.dp))
        }

    }
}

@Composable
fun CoICTScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("CoICT",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {navController.navigate("cse")}, modifier = Modifier.width(300.dp)) {
            Text("CSE", fontSize = 28.sp, modifier = Modifier.padding(horizontal = 50.dp))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {}, modifier = Modifier.width(300.dp)) {
            Text("IST", fontSize = 28.sp, modifier = Modifier.padding(horizontal = 50.dp))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {}, modifier = Modifier.width(300.dp)) {
            Text("INFORMATICS", fontSize = 28.sp, modifier = Modifier.padding(horizontal = 30.dp))
        }
    }
}

@Composable
fun CSEScreen () {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("CSE Department",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {}, modifier = Modifier.width(300.dp)) {
            Text("Computer Science", fontSize = 20.sp, modifier = Modifier.padding(horizontal = 10
                .dp))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {}, modifier = Modifier.width(300.dp)) {
            Text("Computer Engineering", fontSize = 20.sp, modifier = Modifier.padding(horizontal
            = 5.dp))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {}, modifier = Modifier.width(300.dp)) {
            Text("Data Science", fontSize = 20.sp, modifier = Modifier.padding(horizontal = 30.dp))
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun CollegeScreenPreview (){
    Daily_Android_Follow_Up_KotlinTheme {
        CSEScreen()
    }}