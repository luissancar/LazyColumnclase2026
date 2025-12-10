package com.example.lazycolumnclase2026.LaztColumns

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SimpleLazyColumn(modifier: Modifier) {
    Column(modifier = modifier.fillMaxSize()) {

        Text("Topooo")
        LazyColumn(
            Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(100) { index ->
                Text("Elemento $index")

            }
        }

        Text(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp), text = "Footer")

    }
}