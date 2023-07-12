package com.example.pizzaorderapp.compasible

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pizzaorderapp.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun PizzaPlate(){
    Row(
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.plate),
            contentDescription = "plate",
            modifier = Modifier.size(240.dp).fillMaxWidth(),
            alignment = Alignment.Center
        )
    }
}
@Preview(widthDp = 360 , heightDp = 800)
@Composable
fun PreviewPizzaPlate(){
    PizzaPlate()
}