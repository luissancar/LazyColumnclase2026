package com.example.lazycolumnclase2026

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lazycolumnclase2026.Model
import com.example.lazycolumnclase2026.R


@Composable

fun ItemGuitar(model: Model, onItemSelected: (Model) -> Unit) {
    Card(
        border = BorderStroke(2.dp, Color.Black),
        modifier = Modifier
            .padding(10.dp)
            .clickable { onItemSelected(model) }
    ) {
        Column {
            Image(
                painter = painterResource(id = model.image),
                contentDescription = model.modelo,
                modifier = Modifier
                    .width(100.dp)
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = model.marca,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = model.modelo,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                fontSize = 10.sp
            )
        }
    }
}


fun getGuitars(): List<Model> {
    return listOf(
        Model("Fender", "Stratocaster", R.drawable.fenderstratocaster),
        Model("Gibson", "Les Paul", R.drawable.gibsonlespaul),
        Model("Gibson", "175", R.drawable.gibson175),
        Model("Fender", "Stratocaster", R.drawable.fenderstratocaster),
        Model("Gibson", "Les Paul", R.drawable.gibsonlespaul),
        Model("Gibson", "175", R.drawable.gibson175),
        Model("Fender", "Stratocaster", R.drawable.fenderstratocaster),
        Model("Gibson", "Les Paul", R.drawable.gibsonlespaul),
        Model("Gibson", "175", R.drawable.gibson175),
        Model("Fender", "Stratocaster", R.drawable.fenderstratocaster),
        Model("Gibson", "Les Paul", R.drawable.gibsonlespaul),
        Model("Gibson", "175", R.drawable.gibson175),
        Model("Fender", "Stratocaster", R.drawable.fenderstratocaster),
        Model("Gibson", "Les Paul", R.drawable.gibsonlespaul),
        Model("Gibson", "175", R.drawable.gibson175)
    )

}