package com.example.pizzaorderapp.util

object PizzaFakeData {
    val pizza = listOf(
        PizzaModel(
            isFav = false,
            pizzaSize = PizzaSize.S,
            pizzaPrice = 80,
            breadImage = ListOfBreads.breads[0],
        ),
        PizzaModel(
            isFav = false,
            pizzaSize = PizzaSize.S,
            pizzaPrice = 90,
            breadImage = ListOfBreads.breads[1],
        ),
        PizzaModel(
            isFav = false,
            pizzaSize = PizzaSize.S,
            pizzaPrice = 50,
            breadImage = ListOfBreads.breads[2],
        ),
        PizzaModel(
            isFav = false,
            pizzaSize = PizzaSize.S,
            pizzaPrice = 40,
            breadImage = ListOfBreads.breads[3],
        ),
        PizzaModel(
            isFav = false,
            pizzaSize = PizzaSize.S,
            pizzaPrice = 35,
            breadImage = ListOfBreads.breads[4],
        ),
    )
}