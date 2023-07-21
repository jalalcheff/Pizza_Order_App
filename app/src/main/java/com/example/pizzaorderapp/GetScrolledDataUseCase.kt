package com.example.pizzaorderapp

import com.example.pizzaorderapp.util.PizzaFakeData
import com.example.pizzaorderapp.util.PizzaModel

class GetScrolledDataUseCase {
    operator fun invoke(id: Int): PizzaModel{
        return PizzaModel(
            id = PizzaFakeData.pizza[id].id,
            breadImage = PizzaFakeData.pizza[id].breadImage,
            ingredient = PizzaFakeData.pizza[id].ingredient,
            broccoli = PizzaFakeData.pizza[id].broccoli,
            onion = PizzaFakeData.pizza[id].onion,
            pizzaSize = PizzaFakeData.pizza[id].pizzaSize,
            sausage = PizzaFakeData.pizza[id].sausage,
            pizzaPrice = PizzaFakeData.pizza[id].pizzaPrice,
            mushroom = PizzaFakeData.pizza[id].mushroom,
            basil = PizzaFakeData.pizza[id].basil,
            isFav = PizzaFakeData.pizza[id].isFav,
        )
    }
}