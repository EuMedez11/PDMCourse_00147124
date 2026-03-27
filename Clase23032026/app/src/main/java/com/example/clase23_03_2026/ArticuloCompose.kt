package com.example.clase23_03_2026

import android.util.Printer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Arriba(){
    GreetingImgCabecera(
        imagen = painterResource(R.drawable.image_ejercicio1))

}

  @Composable
fun GreetingImgCabecera (
      imagen: Painter,
      modifier: Modifier = Modifier){

    Column (modifier = Modifier){

        Image(
            painter = imagen,
            contentDescription = "Imagen cabecera",
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            textAlign = TextAlign.Justify,
            modifier = Modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = "JIn this tutorial, you build a simple Ul component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's Ul programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the Uls construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name",
            textAlign = TextAlign.Justify,
            modifier = Modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingA(){
    Arriba()
}

