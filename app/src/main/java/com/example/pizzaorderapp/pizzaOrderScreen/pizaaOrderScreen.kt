package com.example.pizzaorderapp.pizzaOrderScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.pizzaorderapp.compasible.AppBar
import com.example.pizzaorderapp.compasible.PizzaPagerOnThePlate
import com.example.pizzaorderapp.compasible.SizeSelector
import com.example.pizzaorderapp.compasible.VerticalSpacer

@Composable
fun PizzaOrderScreen(){
Column(
    modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
) {
    VerticalSpacer(space = 16)
    AppBar()
    VerticalSpacer(space = 16)
    PizzaPagerOnThePlate()
    VerticalSpacer(space = 16)
    Text(
        text = "$17",
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth()
        )
    VerticalSpacer(space = 16)
    SizeSelector()
}
}
@Composable
@Preview (widthDp = 360 , heightDp = 800)
fun PreviewPizzaOrderScreen(){
    PizzaOrderScreen()
}