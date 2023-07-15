package com.example.pizzaorderapp.compasible

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun RandomImages(images: List<Int>) {
    Box(
        modifier = Modifier.fillMaxSize().clip(CircleShape)
    ) {
        images.forEach { image ->
            val randomOffsetX = remember { mutableStateOf(Random.nextInt(16, 400)) }
            val randomOffsetY = remember { mutableStateOf(Random.nextInt(20, 380))}
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier
                    .size(30.dp)
                    .offset { IntOffset(randomOffsetX.value, randomOffsetY.value) }
            )
        }
    }
}