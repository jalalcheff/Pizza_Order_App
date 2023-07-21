package com.example.pizzaorderapp.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.pizzaorderapp.GetScrolledDataUseCase
import com.example.pizzaorderapp.PizzaOrderUiState
import com.example.pizzaorderapp.StoreNewDataUseCase
import com.example.pizzaorderapp.util.PizzaFakeData
import com.example.pizzaorderapp.util.PizzaModel
import com.example.pizzaorderapp.util.PizzaSize
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class PizzaOrderViewModel: ViewModel() {
    private val getScrolledDataUseCase = GetScrolledDataUseCase()
    private val storeNewDataUseCase = StoreNewDataUseCase()
    private val _state = MutableStateFlow(PizzaOrderUiState())
    val state = _state.asStateFlow()
    init {
        _state.update {
            val currentData = getScrolledDataUseCase.invoke(0)
            it.copy(
               id = currentData.id,
               breadImage = currentData.breadImage,
               ingredient = currentData.ingredient,
               broccoli = currentData.broccoli,
               onion = currentData.onion,
               pizzaSize = currentData.pizzaSize,
               sausage = currentData.sausage,
               pizzaPrice = currentData.pizzaPrice,
               mushroom = currentData.mushroom,
               basil = currentData.basil,
               isFav = currentData.isFav,
               )
       }
    }
    fun updateSelectedSize(size: PizzaSize){
        _state.update { it.copy(pizzaSize = size) }
        Log.i("jojo", "state is: ${_state.value}, size: $size")
    }
    fun updateIngredient(selectedIngredientIndex: Int, id: Int){
        when(selectedIngredientIndex)
        {
            0->  _state.update { it.copy(broccoli = !it.broccoli) }
            1->  _state.update { it.copy(mushroom = !it.mushroom) }
            2->  _state.update { it.copy(onion = !it.onion) }
            3->  _state.update { it.copy(sausage = !it.sausage) }
            4->  _state.update { it.copy(basil = !it.basil) }
        }
        StoreNewDataUseCase().invoke(
            id,
            PizzaModel(
                broccoli = _state.value.broccoli,
                onion =  _state.value.onion,
                sausage =  _state.value.sausage,
                mushroom =  _state.value.mushroom,
                basil =  _state.value.basil,
            )
            )
        Log.i("maestro", "ingredient id is : $id")
    }
    fun updateData(id: Int){
        val currentData = getScrolledDataUseCase.invoke(id)
       // Log.i("maestro", "id: $id")
         _state.update {
            it.copy(
                id = currentData.id,
                breadImage = currentData.breadImage,
                ingredient = currentData.ingredient,
                broccoli = currentData.broccoli,
                onion = currentData.onion,
                pizzaSize = currentData.pizzaSize,
                sausage = currentData.sausage,
                pizzaPrice = currentData.pizzaPrice,
                mushroom = currentData.mushroom,
                basil = currentData.basil,
                isFav = currentData.isFav,
            )
        }
    }
}