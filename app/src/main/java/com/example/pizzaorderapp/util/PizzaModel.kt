package com.example.pizzaorderapp.util

import com.example.pizzaorderapp.PizzaOrderUiState

data class PizzaModel(
    val isFav: Boolean ,
    val breadImage: Int ,
    val pizzaPrice: Int ,
    val pizzaSize: PizzaSize,
    val onionIngredients: PizzaOrderUiState.OnionIngredients ,
    val mushroomIngredients: PizzaOrderUiState.MushroomIngredients,
    val sausageIngredients: PizzaOrderUiState.SausageIngredients,
    val basilIngredients: PizzaOrderUiState.BasilIngredients,
    val broccoliIngredients: PizzaOrderUiState.BroccoliIngredients
)
