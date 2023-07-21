package com.example.pizzaorderapp.util

data class PizzaModel(
    val id: Int = 0,
    var isFav: Boolean = false,
    val breadImage: Int = 0,
    var pizzaPrice: Int = 0,
    var pizzaSize: PizzaSize = PizzaSize.S,
    val ingredient: List<Int>? = emptyList(),
    var onion: Boolean = false,
    var sausage: Boolean = false,
    var mushroom: Boolean = false,
    var broccoli: Boolean = false,
    var basil: Boolean = false
   // val ingredient: List<Int>,
)
