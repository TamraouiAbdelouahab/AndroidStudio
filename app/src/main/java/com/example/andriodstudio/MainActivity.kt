package com.example.andriodstudio

import android.content.ClipDescription
import android.graphics.Paint.Align
import android.media.audiofx.AudioEffect.Descriptor
import androidx.compose.ui.graphics.Color // ajouter la bibliothéque de couleur
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight

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
                    // Greeting("abdel")
                    GreetingImage(
                        "Marrakech",
                        "Potier",
                        "L'artisan potier de Marrakech crée des céramiques uniques," +
                                " façonnées à la main, décorées et cuites traditionnellement.",

                        )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String,from: String,modifier: Modifier = Modifier) {
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 150.sp,
            textAlign = TextAlign.Center
        )
}



@Composable
fun GreetingImage(ville: String,title : String,description : String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.potier);
    Box(){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .alpha(0.7f)
        ){
            Image(
                painter = painterResource(id = R.drawable.marrakech), // Remplacez par l'ID de votre image
                contentDescription = "Marrakech Image",
                modifier = Modifier.fillMaxSize(), // Remplit tout l'écran
                contentScale = ContentScale.Crop // Ajuste le redimensionnement de l'image
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = ville,
                style = TextStyle(fontWeight = FontWeight.Bold),
                fontSize = 70.sp,
                textAlign = TextAlign.Center
            )
            Box(modifier = Modifier.fillMaxWidth())
            {
                Image(
                    painter = image,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .aspectRatio(10 / 7f),
                   )
            }
            Text(
                text = title,
                style = TextStyle(fontWeight = FontWeight.Bold),
                fontSize = 50.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = description,
                style = TextStyle(fontWeight = FontWeight.Bold),
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 80.dp, start = 10.dp, end = 20.dp)
            )


        }
    }
}

@Preview(showBackground = true,
        showSystemUi = true,
        )
@Composable
fun GreetingPreview() {
    AndriodStudioTheme {
        GreetingImage(
            "Marrakech",
            "Potier",
            "L'artisan potier de Marrakech crée des céramiques uniques," +
                    " façonnées à la main, décorées et cuites traditionnellement.",

        )
    }
}