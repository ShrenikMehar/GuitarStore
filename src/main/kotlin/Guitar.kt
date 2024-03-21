package org.example

data class Guitar(
    val serialNumber: String,
    val price: Double,
    val builder: Builder,
    val model: String,
    val type: Type,
    val backWood: Wood,
    val topWood: Wood
)