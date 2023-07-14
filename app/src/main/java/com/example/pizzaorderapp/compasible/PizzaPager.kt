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
import com.example.pizzaorderapp.util.ListOfBreads
import com.example.pizzaorderapp.util.PizzaSize

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PizzaPager(
    breads: List<Int>,
    pizzaSize: PizzaSize
){
    Box(
        contentAlignment = Alignment.Center
    ) {
        HorizontalPager(
            pageCount = breads.size,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = breads[it]),
                contentDescription = "bread",
                modifier = Modifier.size(
                    size = when(pizzaSize){
                        PizzaSize.S -> 192.dp
                        PizzaSize.M -> 200.dp
                        PizzaSize.L -> 208.dp
                    },
                )
            )
        }
    }

}

@Composable
@Preview(widthDp = 360 , heightDp = 800)
fun PreviewPizzaPager(){
    PizzaPager(breads = listOf(
        R.drawable.bread_1,
        R.drawable.bread_2,
        R.drawable.bread_3,
        R.drawable.bread_4,
        R.drawable.bread_5,
    ),PizzaSize.S)
}