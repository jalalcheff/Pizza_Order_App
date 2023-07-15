package com.example.pizzaorderapp.compasible

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pizzaorderapp.R

@Composable
fun IngredientRecycler(onClickIngredient:(Int)->Unit, ingredients: List<Boolean>) {
    val selected = true
    val list = listOf(
        R.drawable.ing1,
        R.drawable.ing2,
        R.drawable.ing3,
        R.drawable.ing4,
        R.drawable.ing5,
    )
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(list) {
            ImageRecycler(
                imageUrl = it,
                ingredientIndex = list.indexOf(it),
                onClickIngredient = onClickIngredient,
                ingredients = ingredients
            )
        }
    }
}

@Composable
@Preview(widthDp = 360, heightDp = 800)
fun PreviewIngredientRecycler() {
}