package com.example.animals

import java.io.Serializable

data class AnimalData(
    val name: String,
    val description: String,
    val imageResId: Int
) : Serializable
