package com.example.pizzaorderapp.compasible

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pizzaorderapp.PizzaOrderUiState
import com.example.pizzaorderapp.R
import com.example.pizzaorderapp.util.ListOfIngredients
import com.example.pizzaorderapp.util.PizzaSize
import kotlin.random.Random

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PizzaPager(
    breads: List<Int>,
    pizzaSize: PizzaSize,
) {
    Box(
        contentAlignment = Alignment.Center
    ) {
        HorizontalPager(
            pageCount = breads.size,
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier.size(
                    size = when (pizzaSize) {
                        PizzaSize.S -> 192.dp
                        PizzaSize.M -> 200.dp
                        PizzaSize.L -> 208.dp
                    },
                )
            ) {
                Image(
                    painter = painterResource(id = breads[it]),
                    contentDescription = "bread",
                    modifier = Modifier.fillMaxSize()
                )
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .fillMaxSize()
                        .clip(CircleShape)
                ) {
                    for (i in 0..4){
                        BoxOfIngredients(ingredients = ListOfIngredients.basil.ingredientImage)
                        BoxOfIngredients(ingredients = ListOfIngredients.onion.ingredientImage)
                        BoxOfIngredients(ingredients = ListOfIngredients.broccoli.ingredientImage)
                        BoxOfIngredients(ingredients = ListOfIngredients.mushroom.ingredientImage)
                        BoxOfIngredients(ingredients = ListOfIngredients.sausage.ingredientImage)
                    }

                }

            }

        }

    }

}

@Composable
@Preview(widthDp = 360, heightDp = 800)
fun PreviewPizzaPager() {
    PizzaPager(
        breads = listOf(
            R.drawable.bread_1,
            R.drawable.bread_2,
            R.drawable.bread_3,
            R.drawable.bread_4,
            R.drawable.bread_5,
        ), PizzaSize.S,
    )
}

data class Position(val x: Int, val y: Int)

fun generateRandomPosition(): Position {
    // Logic to generate random x and y coordinates within the box boundaries
    // Implement your own logic based on your specific requirements

    val randomX = Random.nextInt(0, 190)
    val randomY = Random.nextInt(0, 190)
    return Position(randomX, randomY)
}