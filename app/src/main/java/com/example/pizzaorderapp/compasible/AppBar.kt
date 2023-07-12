package com.example.pizzaorderapp.compasible

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pizzaorderapp.R

@Composable
fun AppBar(){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
    ) {
        Image(
            painter = painterResource(id = R.drawable.baseline_arrow_back_24),
            contentDescription = "back"
        )
        PizzaTitleText(
            text = "Pizza"
            )
        Image(painter = painterResource(
            id = R.drawable.baseline_favorite_24),
            contentDescription = "favourite"
        )
    }
}

@Composable
@Preview(widthDp = 360)
fun PreviewAppBar(){
    AppBar()
}