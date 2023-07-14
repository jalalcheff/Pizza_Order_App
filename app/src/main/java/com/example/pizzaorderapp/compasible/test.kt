package com.example.pizzaorderapp.compasible


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pizzaorderapp.R
import kotlin.random.Random

@Composable
fun TryDistrbute() {
    val list = mutableListOf<Unit>()
    val position by remember { mutableStateOf(generateRandomPosition()) }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            Modifier
                .size(100.dp)
                .background(Color.Black).align(CenterHorizontally),

        ) {
            for (i in 0..5){
                val position by remember { mutableStateOf(generateRandomPosition()) }
                Image(
                    painter = painterResource(id = R.drawable.bread_1),
                    contentDescription = "image$i",
                    modifier = Modifier
                        .size(10.dp)
                        .offset(x = position.x.dp, y = position.y.dp)
                )
            }
        }
    }

}
@Composable
@Preview(widthDp = 360, heightDp = 800)
fun PreviewDistrbute(){
    TryDistrbute()
}
data class Position(val x: Int, val y: Int)

fun generateRandomPosition(): Position {
    // Logic to generate random x and y coordinates within the box boundaries
    // Implement your own logic based on your specific requirements

    val randomX = Random.nextInt(0,50)
    val randomY = Random.nextInt(0, 50)
    return Position(randomX, randomY)
}