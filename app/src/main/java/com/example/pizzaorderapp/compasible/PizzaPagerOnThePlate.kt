package com.example.pizzaorderapp.compasible

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.example.pizzaorderapp.util.IngredientTypes
import com.example.pizzaorderapp.util.PizzaSize

@Composable
fun PizzaPagerOnThePlate(
    imageResource: List<Int>,
    pizzaSize: PizzaSize,
    ingredientTypes: IngredientTypes,
    onScroll:(Int)->Unit
    ){
    Box(contentAlignment = Alignment.Center) {
        PizzaPlate()
        PizzaPager(imageResource, pizzaSize, ingredientTypes, onScroll)
    }
}

@Composable
@Preview(widthDp = 360 , heightDp = 800)
fun PreviewPizzaPagerOnThePlate(){
}