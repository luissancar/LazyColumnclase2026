package com.example.lazycolumnclase2026.LaztColumns


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.lazycolumnclase2026.Model
import com.example.lazycolumnclase2026.getGuitars
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.ExperimentalFoundationApi
import com.example.lazycolumnclase2026.ItemGuitar

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HeaderLazy(modifier: Modifier) {

    val guitarrasPorMarca : Map<String, List<Model>> =
        getGuitars().groupBy { it.marca }

    LazyColumn(modifier=modifier.fillMaxSize()) {
        guitarrasPorMarca.forEach { (marca, guitarras) ->
            stickyHeader {
                Text(text = marca,
                    modifier= Modifier
                        .fillMaxWidth()
                        .background(Color.LightGray),
                    fontSize = 30.sp)
            }
            items(guitarras){
                guitarra->
                ItemGuitar(guitarra){}
            }

        }

    }

}