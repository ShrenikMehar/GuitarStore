package org.example

class Inventory(private val guitars: List<Guitar>) {
    fun addGuitar(
         serialNumber: String,
         price: Double,
         builder: String,
         model: String,
         type: String,
         backWood: String,
         topWood: String
    ) {
         guitars.addLast(
             Guitar(serialNumber, price, builder, model, type, backWood, topWood)
         )
     }

    fun getGuitar(serialNumber: String): Guitar? {
        for (guitar in guitars)
            if (guitar.getSerialNumber() == serialNumber) return guitar
        return null
    }

    fun search(guitar: Guitar): Guitar? {
        if (guitar in guitars) return guitar
        return null
    }
}