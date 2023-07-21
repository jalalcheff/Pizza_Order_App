package com.example.pizzaorderapp

import com.example.pizzaorderapp.util.PizzaModel
import com.example.pizzaorderapp.util.PizzaSize

data class PizzaOrderUiState(
    val id: Int = 0,
    val isFav: Boolean = false,
    val breadImage: Int = R.drawable.bread_1,
    val pizzaPrice: Int = 70,
    val pizzaSize: PizzaSize = PizzaSize.S,
    val ingredient: List<Int>? = emptyList(),
    val onion: Boolean = false,
    val sausage: Boolean = false,
    val mushroom: Boolean = false,
    val broccoli: Boolean = false,
    val basil: Boolean = false
)
fun PizzaModel.toUiState(): PizzaOrderUiState{
    return PizzaOrderUiState(
        isFav = isFav,
        pizzaPrice = pizzaPrice,
        pizzaSize = pizzaSize,
        breadImage = breadImage
    )
}
