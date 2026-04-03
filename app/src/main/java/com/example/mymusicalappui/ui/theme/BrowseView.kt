package com.example.mymusicalappui.ui.theme

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import com.example.mymusicalappui.R

@Composable
fun Browse(){
    val categories = listOf("HITS ", "HAPPY", "YOGA", "WORKOUT", "SAD", "ROMANTIC", "RUNNING")
    LazyVerticalGrid(GridCells.Fixed(2)){
        items(categories){
            cat ->
            BrowserItem(cat=cat, drawable = R.drawable.outline_browse_24)
        }
    }
}