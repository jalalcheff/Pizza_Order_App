package com.example.pizzaorderapp.compasible

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pizzaorderapp.ui.theme.LightGreen
import com.example.pizzaorderapp.util.Ingredients

@Composable
fun ImageRecycler(
    imageUrl: Int,
    ingredient: Boolean,
    onClickIngredient:(Boolean,Int) -> Unit
){
    Image(
        painter = painterResource(id = imageUrl),
        contentDescription = "images",
        modifier = Modifier
            .size(56.dp)
            .clip(CircleShape)
            .background(
                color = if (ingredient) LightGreen else Color.White
            )
            .clickable { onClickIngredient(ingredient,2) }
    )
}