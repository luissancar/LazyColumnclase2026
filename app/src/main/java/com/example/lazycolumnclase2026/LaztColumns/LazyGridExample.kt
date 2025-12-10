package com.example.lazycolumnclase2026.LaztColumns

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.lazycolumnclase2026.ItemGuitar
import com.example.lazycolumnclase2026.getGuitars

@Composable
fun LazyGridGuitars(modifier: Modifier) {

    val context= LocalContext.current
    LazyVerticalGrid(
        modifier=modifier.fillMaxSize(),
      //  columns= GridCells.Fixed(2),
        columns = GridCells.Adaptive(100.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ){
       items(getGuitars()){
           guitarra ->
           ItemGuitar(guitarra){}
        }

    }


}