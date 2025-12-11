package com.example.lazycolumnclase2026.LaztColumns

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.lazycolumnclase2026.ItemGuitar
import com.example.lazycolumnclase2026.getGuitars


@Composable
fun LazyColumnGuitars(modifier: Modifier) {
    val context= LocalContext.current
    LazyRow(
        modifier=modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
       // verticalArrangement = Arrangement.spacedBy(8.dp),
        //horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(getGuitars()){
            guitarra ->
            ItemGuitar(guitarra){
                Toast.makeText(
                    context,
                    "${guitarra.marca}  ${guitarra.modelo}",
                    Toast.LENGTH_LONG
                ).show()

            }
        }
    }
}
