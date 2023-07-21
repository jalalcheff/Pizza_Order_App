package com.example.pizzaorderapp.util

import com.example.pizzaorderapp.R

object PizzaFakeData {
    val pizza = mutableListOf(
        PizzaModel(
            id = 0,
            isFav = false,
            pizzaSize = PizzaSize.S,
            pizzaPrice = 80,
            breadImage = ListOfBreads.breads[0],
            ingredient = emptyList(),
            onion = false,
            sausage = false,
            mushroom = false,
            broccoli = false,
            basil = false
        ),
        PizzaModel(
            id = 1,
            isFav = false,
            pizzaSize = PizzaSize.S,
            pizzaPrice = 90,
            breadImage = ListOfBreads.breads[1],
            ingredient = emptyList(),
            onion = false,
            sausage = false,
            mushroom = false,
            broccoli = false,
            basil = false
        ),
        PizzaModel(
            id = 2,
            isFav = false,
            pizzaSize = PizzaSize.S,
            pizzaPrice = 50,
            breadImage = ListOfBreads.breads[2],
            ingredient = emptyList(),
            onion = false,
            sausage = false,
            mushroom = false,
            broccoli = false,
            basil = false
        ),
        PizzaModel(
            id = 3,
            isFav = false,
            pizzaSize = PizzaSize.S,
            pizzaPrice = 40,
            breadImage = ListOfBreads.breads[3],
            ingredient = emptyList(),
            onion = false,
            sausage = false,
            mushroom = false,
            broccoli = false,
            basil = false
        ),
        PizzaModel(
            id = 4,
            isFav = false,
            pizzaSize = PizzaSize.S,
            pizzaPrice = 35,
            breadImage = ListOfBreads.breads[4],
            ingredient = emptyList(),
            onion = false,
            sausage = false,
            mushroom = false,
            broccoli = false,
            basil = false
        ),
    )
}