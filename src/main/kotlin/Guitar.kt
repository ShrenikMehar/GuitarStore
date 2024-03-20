package org.example

class Guitar(
    private val serialNumber: String,
    private val price: Double,
    private val builder: String,
    private val model: String,
    private val type: String,
    private val backWood: String,
    private val topWood: String
) {
    fun getSerialNumber() = serialNumber
    fun getPrice() = price
    fun getBuilder() = builder
    fun getModel() = model
    fun getType() = type
    fun getBackWood() = backWood
    fun getTopWood() = topWood
}