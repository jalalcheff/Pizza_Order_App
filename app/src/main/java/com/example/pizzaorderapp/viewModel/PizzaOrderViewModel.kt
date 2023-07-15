package com.example.pizzaorderapp.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pizzaorderapp.PizzaOrderUiState
import com.example.pizzaorderapp.R
import com.example.pizzaorderapp.toUiState
import com.example.pizzaorderapp.util.PizzaFakeData
import com.example.pizzaorderapp.util.PizzaFakeData.pizza
import com.example.pizzaorderapp.util.PizzaSize
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

class PizzaOrderViewModel: ViewModel() {
    private val _state = MutableStateFlow(PizzaOrderUiState())
    val state = _state.asStateFlow()
    init {
       viewModelScope.launch { _state.emit(pizza[0].toUiState())}
    }
    fun updateSelectedSize(size: PizzaSize){
        _state.update { it.copy(pizzaSize = size) }
    }
    fun updateBasilIngredient(selectedIngredient: PizzaOrderUiState.BasilIngredients){
        _state.update { it.copy(basilIngredient = selectedIngredient) }
    }
    fun updateBroccoliIngredient(selectedIngredient: PizzaOrderUiState.BroccoliIngredients){
        _state.update { it.copy(broccoliIngredient = selectedIngredient) }
    }
    fun updateMushroomIngredient(selectedIngredient: PizzaOrderUiState.MushroomIngredients){
        _state.update { it.copy(mushroomIngredient = selectedIngredient) }
    }
    fun updateOnionIngredient(selectedIngredient: PizzaOrderUiState.OnionIngredients){
        _state.update { it.copy(onionIngredient = selectedIngredient) }
    }
    fun updateIngredient(selectedIngredient: List<Int>){
        _state.update { it.copy(ingredients = selectedIngredient) }
    }
}