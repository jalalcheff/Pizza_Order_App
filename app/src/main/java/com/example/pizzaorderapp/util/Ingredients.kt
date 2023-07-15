package com.example.pizzaorderapp.util

import com.example.pizzaorderapp.PizzaOrderUiState

data class Ingredients(
    val basilIngredient: PizzaOrderUiState.BasilIngredients = ListOfIngredients.basil,
    val broccoliIngredient: PizzaOrderUiState.BroccoliIngredients = ListOfIngredients.broccoli,
    val mushroomIngredient: PizzaOrderUiState.MushroomIngredients = ListOfIngredients.mushroom,
    val onionIngredient: PizzaOrderUiState.OnionIngredients = ListOfIngredients.onion,
    val sausageIngredient: PizzaOrderUiState.SausageIngredients = ListOfIngredients.sausage,
)
