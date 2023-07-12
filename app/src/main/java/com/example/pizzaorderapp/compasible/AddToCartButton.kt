package com.example.pizzaorderapp.compasible

import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pizzaorderapp.R
import com.example.pizzaorderapp.ui.theme.DarkBrown

@Composable
fun AddToCartButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
    ) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(DarkBrown),
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.baseline_shopping_cart_24),
            contentDescription = "shop",
            colorFilter = ColorFilter.tint(Color.White)
        )
        HorizontalSpacer(space = 8)
        Text(text = "Add to cart")
    }
}

@Preview
@Composable
fun previewAddToCartButton() {
    AddToCartButton({})
}