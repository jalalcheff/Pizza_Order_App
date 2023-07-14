package com.example.pizzaorderapp.util

data class PizzaModel(
    val isFav: Boolean ,
    val breadImage: Int ,
    val pizzaPrice: Int ,
    val pizzaSize: PizzaSize ,
   // val ingredient: List<Int>,
)
