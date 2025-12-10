package com.example.lazycolumnclase2026

import androidx.annotation.DrawableRes

data class Model(
    var marca:String,
    var modelo:String,
    @DrawableRes var image: Int
)
