package com.example.pizzaorderapp.util

import com.example.pizzaorderapp.PizzaOrderUiState

data class PizzaModel(
    val isFav: Boolean ,
    val breadImage: Int ,
    val pizzaPrice: Int ,
    val pizzaSize: PizzaSize,
    val ingredient: PizzaOrderUiState.Ingredients,
)
