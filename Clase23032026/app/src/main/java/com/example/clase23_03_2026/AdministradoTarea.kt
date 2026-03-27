package com.example.clase23_03_2026

import android.R.attr.top
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable

fun Greetingejercicio2(){
    Column(modifier= Modifier.fillMaxWidth().fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        val image = painterResource(R.drawable.imagen_check)
        Image(painter = image, contentDescription = null)
        Text(
            text = stringResource(R.string.texto1),
             modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.texto2),
            fontSize = 16.sp
        )

    }
}
@Preview(showBackground = true)
@Composable
fun Greetingejercicio(){
    Greetingejercicio2()
}
