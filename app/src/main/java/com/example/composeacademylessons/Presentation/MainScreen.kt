package com.example.composeacademylessons.Presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.composeacademylessons.Data.carFakeData

@Composable
fun MainScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(carFakeData()){ item ->
            CarItem(carModel = item)
        }
    }


}