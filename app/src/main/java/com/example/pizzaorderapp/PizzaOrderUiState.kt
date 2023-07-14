package com.example.pizzaorderapp

import com.example.pizzaorderapp.util.PizzaModel
import com.example.pizzaorderapp.util.PizzaSize

data class PizzaOrderUiState(
    val isFav: Boolean = false,
    val breadImage: Int = R.drawable.bread_1,
    val pizzaPrice: Int = 70,
    val pizzaSize: PizzaSize = PizzaSize.S,
    val ingredient: List<Int>? = emptyList(),
)
fun PizzaModel.toUiState(): PizzaOrderUiState{
    return PizzaOrderUiState(
        isFav = isFav,
        pizzaPrice = pizzaPrice,
        pizzaSize = pizzaSize,
        breadImage = breadImage
    )
}
