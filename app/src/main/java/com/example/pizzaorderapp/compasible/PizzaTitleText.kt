package com.example.pizzaorderapp.compasible

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun PizzaTitleText(
    text: String,
    modifier: Modifier = Modifier
){
    Text(
        text = text,
        textAlign = TextAlign.Center,
        modifier = modifier,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 20.sp,
        )
}