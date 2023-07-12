package com.example.pizzaorderapp.pizzaOrderScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pizzaorderapp.compasible.AddToCartButton
import com.example.pizzaorderapp.compasible.AppBar
import com.example.pizzaorderapp.compasible.IngredientRecycler
import com.example.pizzaorderapp.compasible.PizzaPagerOnThePlate
import com.example.pizzaorderapp.compasible.PizzaTitleText
import com.example.pizzaorderapp.compasible.SizeSelector
import com.example.pizzaorderapp.compasible.VerticalSpacer

@Composable
fun PizzaOrderScreen(){
Column(
    modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
) {
    VerticalSpacer(space = 24)
    AppBar()
    VerticalSpacer(space = 24)
    PizzaPagerOnThePlate()
    VerticalSpacer(space = 24)
    PizzaTitleText(text = "$17" , Modifier.fillMaxWidth())
    VerticalSpacer(space = 24)
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        SizeSelector("S", true)
        SizeSelector("M" , false)
        SizeSelector("L" , false)
    }
    VerticalSpacer(space = 24)
    Text(
        text = "customize your Pizza",
        modifier = Modifier.padding(start = 16.dp)
        )
    VerticalSpacer(space = 16)
    IngredientRecycler()
    VerticalSpacer(space = 56)
    AddToCartButton({} , modifier = Modifier.align(Alignment.CenterHorizontally))
}
}
@Composable
@Preview (widthDp = 360 , heightDp = 800)
fun PreviewPizzaOrderScreen(){
    PizzaOrderScreen()
}