package com.example.pizzaorderapp

import com.example.pizzaorderapp.util.PizzaModel
import com.example.pizzaorderapp.util.PizzaSize

data class PizzaOrderUiState(
    val isFav: Boolean = false,
    val breadImage: Int = R.drawable.bread_1,
    val pizzaPrice: Int = 70,
    val pizzaSize: PizzaSize = PizzaSize.S,
    val basilIngredient: BasilIngredients? = BasilIngredients(emptyList(),false),
    val broccoliIngredient: BroccoliIngredients? = BroccoliIngredients(emptyList(),false),
    val mushroomIngredient: MushroomIngredients? = MushroomIngredients(emptyList(),false),
    val onionIngredient: OnionIngredients? = OnionIngredients(emptyList(),false),
    val sausageIngredient: SausageIngredients? = SausageIngredients(emptyList(),false),
    val ingredients: List<Boolean> = emptyList(),
    val onion: Boolean = false,
    val basil: Boolean = false,
    val mushroom: Boolean = false,
    val sausage: Boolean = false,
    val broccoli: Boolean = false
    ){
    data class BasilIngredients(
        val ingredientImage: List<Int>,
        val isSelected: Boolean
    )
    data class BroccoliIngredients(
        val ingredientImage: List<Int>,
        val isSelected: Boolean
    )
    data class MushroomIngredients(
        val ingredientImage: List<Int>,
        val isSelected: Boolean
    )
    data class OnionIngredients(
        val ingredientImage: List<Int>,
        val isSelected: Boolean
    )
    data class SausageIngredients(
        val ingredientImage: List<Int>,
        val isSelected: Boolean
    )
    data class Ingredient(
        val basil: Int,
        val broccoli: Int,
        val mushroom: Int,
        val onion: Int,
        val sausage: Int
    )
}

fun PizzaModel.toUiState(): PizzaOrderUiState {
    return PizzaOrderUiState(
        isFav = isFav,
        pizzaPrice = pizzaPrice,
        pizzaSize = pizzaSize,
        breadImage = breadImage
    )
}
