package com.example.lazycolumnclase2026

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lazycolumnclase2026.LaztColumns.HeaderLazy
import com.example.lazycolumnclase2026.LaztColumns.LazyColumnGuitars
import com.example.lazycolumnclase2026.LaztColumns.LazyControl
import com.example.lazycolumnclase2026.LaztColumns.LazyGridGuitars
import com.example.lazycolumnclase2026.LaztColumns.SimpleLazyColumn
import com.example.lazycolumnclase2026.ui.theme.LazyColumnclase2026Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LazyColumnclase2026Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  //  SimpleLazyColumn(modifier)
  //  LazyColumnGuitars(modifier)
    //LazyGridGuitars(modifier)
   // LazyControl(modifier)
    HeaderLazy(modifier)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LazyColumnclase2026Theme {
        Greeting("Android")
    }
}