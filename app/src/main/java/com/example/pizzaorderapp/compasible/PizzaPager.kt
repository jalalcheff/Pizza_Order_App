package com.example.pizzaorderapp.compasible

import android.util.Log
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pizzaorderapp.R
import com.example.pizzaorderapp.util.IngredientTypes
import com.example.pizzaorderapp.util.ListOfIngredients
import com.example.pizzaorderapp.util.PizzaSize

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PizzaPager(
    breads: List<Int>,
    pizzaSize: PizzaSize,
    ingredientTypes: IngredientTypes,
    onScroll: (Int) -> Unit
){
    val pagerState = rememberPagerState()
    val ingredients = ListOfIngredients
    Box(
        contentAlignment = Alignment.Center
    ) {
        HorizontalPager(
            pageCount = breads.size,
            modifier = Modifier.fillMaxWidth(),
            state = pagerState
        ) {
            Log.i("again", "not now")

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

                        RandomImages(images = ingredients.basil, ingredientTypes.basil)
                        RandomImages(images = ingredients.onion, ingredientTypes.onion)
                        RandomImages(images = ingredients.broccoli, ingredientTypes.broccoli)
                        RandomImages(images = ingredients.mushroom, ingredientTypes.mushroom)
                        RandomImages(images = ingredients.sausage, ingredientTypes.sausage)
                }

            }

        }

    }
    LaunchedEffect(key1 = pagerState.currentPage){
        onScroll(pagerState.currentPage)
    }

}

@Composable
@Preview(widthDp = 360 , heightDp = 800)
fun PreviewPizzaPager(){

}