package com.example.pizzaorderapp

import com.example.pizzaorderapp.util.PizzaFakeData
import com.example.pizzaorderapp.util.PizzaModel

class StoreNewDataUseCase {
    operator fun invoke(index: Int, pizzaModel: PizzaModel){
        PizzaFakeData.pizza[index].basil = pizzaModel.basil
        PizzaFakeData.pizza[index].broccoli = pizzaModel.broccoli
        PizzaFakeData.pizza[index].mushroom = pizzaModel.mushroom
        PizzaFakeData.pizza[index].sausage = pizzaModel.sausage
        PizzaFakeData.pizza[index].onion = pizzaModel.onion

    }
}