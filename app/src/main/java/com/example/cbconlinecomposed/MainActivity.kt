package com.example.cbconlinecomposed

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cbconlinecomposed.ui.theme.CBCOnlineComposedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CBCOnlineComposedTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column (
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                            ){
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = "C.B.C Online",
                                style = TextStyle(
                                    color = Color.Blue,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 18.sp

                                )
                            )

                            Text(
                                modifier = Modifier.clickable(enabled = true){
                                    Log.d("Clicked", "onCreate: button clicked")
                                },
                                text = "SKIP",
                                style = TextStyle(
                                    color = Color.Blue,
                                    fontWeight = FontWeight.W500,
                                    fontSize = 16.sp

                                )
                            )

                        }

                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CBCOnlineComposedTheme {
        Column() {
            Greeting("Android")
            Greeting("Android")
        }

    }
}