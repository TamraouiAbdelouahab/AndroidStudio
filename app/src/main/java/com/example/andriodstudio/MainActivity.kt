package com.example.andriodstudio

import androidx.compose.ui.graphics.Color // ajouter la bibliothéque de couleur
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.andriodstudio.ui.theme.AndriodStudioTheme

class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndriodStudioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("abdel")
                }
            }
        }
    }
}




@Composable
fun Greeting(name: String) {
    Row(
        content = {
            Text("Some text")
            Text("Some more text")
            Text("Last text")
        }
    )

}



@Preview(showBackground = true,
        showSystemUi = true,
        )
@Composable
fun GreetingPreview() {
    AndriodStudioTheme {
        //Greeting("Abdelouahab")
        Greeting("abdelouwahab")
    }
}