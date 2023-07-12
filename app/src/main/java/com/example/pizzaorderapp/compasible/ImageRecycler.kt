package com.example.pizzaorderapp.compasible

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pizzaorderapp.ui.theme.LightGreen

@Composable
fun ImageRecycler(
    imageUrl: Int,
    isSelected: Boolean
){
    Image(
        painter = painterResource(id = imageUrl),
        contentDescription = "images",
        modifier = Modifier
            .size(56.dp)
            .clip(CircleShape)
            .background(
                color = if (isSelected) LightGreen else Color.White
            )
    )
}