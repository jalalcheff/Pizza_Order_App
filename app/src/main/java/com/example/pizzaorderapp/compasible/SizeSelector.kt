package com.example.pizzaorderapp.compasible


import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SizeSelector(
    buttonText: String,
    isSelected: Boolean

) {
Button(
    onClick = { /*TODO*/ },
    modifier = Modifier.size(56.dp),
    colors = ButtonDefaults.buttonColors(Color.White),
    elevation = ButtonDefaults.buttonElevation(
        defaultElevation = if (isSelected) 16.dp else 0.dp
    )
    ) {
    Text(
        text = buttonText,
        color = Color.Black
        )
}
}

@Composable
@Preview(widthDp = 360, heightDp = 800)
fun PreviewSizeSelector() {
    SizeSelector("S",false)
}