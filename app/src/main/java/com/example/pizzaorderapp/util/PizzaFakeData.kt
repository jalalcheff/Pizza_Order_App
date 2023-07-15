package com.example.pizzaorderapp.util

import com.example.pizzaorderapp.PizzaOrderUiState

object PizzaFakeData {
    val pizza = listOf(
        PizzaModel(
            isFav = false,
            pizzaSize = PizzaSize.S,
            pizzaPrice = 80,
            breadImage = ListOfBreads.breads[0],
            onionIngredients = PizzaOrderUiState.OnionIngredients(emptyList(),false),
            broccoliIngredients =  PizzaOrderUiState.BroccoliIngredients(emptyList(),false),
            sausageIngredients =  PizzaOrderUiState.SausageIngredients(emptyList(),false),
            basilIngredients =  PizzaOrderUiState.BasilIngredients(emptyList(),false),
            mushroomIngredients =  PizzaOrderUiState.MushroomIngredients(emptyList(),false),
        ),
    )
}