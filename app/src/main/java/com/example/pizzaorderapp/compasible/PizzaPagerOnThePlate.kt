package com.example.pizzaorderapp.compasible

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pizzaorderapp.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PizzaPagerOnThePlate(){
    Box(
        contentAlignment = Alignment.Center
    ) {
        PizzaPlate()
        PizzaPager()
    }
}

@Composable
@Preview(widthDp = 360 , heightDp = 800)
fun PreviewPizzaPagerOnThePlate(){
    PizzaPagerOnThePlate()
}