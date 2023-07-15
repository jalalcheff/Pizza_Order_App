package com.example.pizzaorderapp.util

object PizzaFakeData {
    val pizza = listOf(
        PizzaModel(
            isFav = false,
            pizzaSize = PizzaSize.S,
            pizzaPrice = 80,
            breadImage = ListOfBreads.breads[0],
            ingredient = ListOfIngredients.broccoli
        ),
        PizzaModel(
            isFav = false,
            pizzaSize = PizzaSize.S,
            pizzaPrice = 90,
            breadImage = ListOfBreads.breads[1],
            ingredient = ListOfIngredients.broccoli
        ),
        PizzaModel(
            isFav = false,
            pizzaSize = PizzaSize.S,
            pizzaPrice = 50,
            breadImage = ListOfBreads.breads[2],
            ingredient = ListOfIngredients.broccoli
        ),
        PizzaModel(
            isFav = false,
            pizzaSize = PizzaSize.S,
            pizzaPrice = 40,
            breadImage = ListOfBreads.breads[3],
            ingredient = ListOfIngredients.broccoli
        ),
        PizzaModel(
            isFav = false,
            pizzaSize = PizzaSize.S,
            pizzaPrice = 35,
            breadImage = ListOfBreads.breads[4],
            ingredient = ListOfIngredients.broccoli
        ),
    )
}