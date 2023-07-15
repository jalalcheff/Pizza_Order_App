package com.example.pizzaorderapp.compasible

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip

@Composable
fun BoxOfIngredients(ingredients: List<Int>){
    Box(
        modifier = Modifier
            .clip(CircleShape)
            .fillMaxSize()
            .clip(CircleShape)
    ) { RandomImages(images = ingredients) }
}