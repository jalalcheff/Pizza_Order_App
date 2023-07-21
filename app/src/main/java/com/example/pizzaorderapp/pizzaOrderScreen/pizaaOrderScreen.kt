package com.example.pizzaorderapp.pizzaOrderScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.pizzaorderapp.PizzaOrderUiState
import com.example.pizzaorderapp.compasible.AddToCartButton
import com.example.pizzaorderapp.compasible.AppBar
import com.example.pizzaorderapp.compasible.HorizontalSpacer
import com.example.pizzaorderapp.compasible.IngredientRecycler
import com.example.pizzaorderapp.compasible.PizzaPagerOnThePlate
import com.example.pizzaorderapp.compasible.PizzaTitleText
import com.example.pizzaorderapp.compasible.SizeSelector
import com.example.pizzaorderapp.compasible.VerticalSpacer
import com.example.pizzaorderapp.util.Constants
import com.example.pizzaorderapp.util.IngredientTypes
import com.example.pizzaorderapp.util.ListOfBreads
import com.example.pizzaorderapp.util.PizzaSize
import com.example.pizzaorderapp.viewModel.PizzaOrderViewModel

@Composable
fun PizzaOrderScreen(viewModel: PizzaOrderViewModel = hiltViewModel()){
    val breads = ListOfBreads.breads
    val state by viewModel.state.collectAsState()
    PizzaOrderScreenContent(
        state = state,
        onClick = {
            when(it){
            Constants.S -> { viewModel.updateSelectedSize( PizzaSize.S) }
            Constants.M -> { viewModel.updateSelectedSize(PizzaSize.M) }
            Constants.L -> { viewModel.updateSelectedSize(PizzaSize.L) }
            }},
        breads = breads,
        onClickIngredient = { ingredentIndex, pageIndex ->
            viewModel.updateIngredient(ingredentIndex, pageIndex)
                            },
        onScroll = {viewModel.updateData(it)}
    )
}
@Composable
fun PizzaOrderScreenContent(
    state: PizzaOrderUiState,
    onClick: (String) -> Unit,
    breads:List<Int>,
    onClickIngredient:(Int,Int) -> Unit,
    onScroll:(Int)->Unit
){
    val ingredientTypes = IngredientTypes(
        basil = state.basil,
        mushroom = state.mushroom,
        onion = state.onion,
        sausage = state.sausage,
        broccoli = state.broccoli
    )
Column(
    modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
) {
    VerticalSpacer(space = 24)
    AppBar()
    VerticalSpacer(space = 24)
    PizzaPagerOnThePlate(breads, state.pizzaSize, ingredientTypes, onScroll)
    VerticalSpacer(space = 24)
    PizzaTitleText(text = "$${state.pizzaPrice}", Modifier.fillMaxWidth())
    VerticalSpacer(space = 24)
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        SizeSelector(Constants.S, (state.pizzaSize == PizzaSize.S), onClick)
        HorizontalSpacer(space = 16)
        SizeSelector(Constants.M, (state.pizzaSize == PizzaSize.M), onClick)
        HorizontalSpacer(space = 16)
        SizeSelector(Constants.L, (state.pizzaSize == PizzaSize.L), onClick)
    }
    VerticalSpacer(space = 24)
    Text(
        text = "customize your Pizza",
        modifier = Modifier.padding(start = 16.dp)
    )
    VerticalSpacer(space = 16)
    IngredientRecycler({ onClickIngredient(it, state.id) }, ingredientTypes, state.id)
    VerticalSpacer(space = 56)
    AddToCartButton({} , modifier = Modifier.align(Alignment.CenterHorizontally))
}
}
@Composable
@Preview (widthDp = 360 , heightDp = 800)
fun PreviewPizzaOrderScreen(){
}