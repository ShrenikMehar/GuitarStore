package org.example

class Inventory(private val guitars: MutableList<Guitar>) {
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

    fun search(parameterToSearch: String): Guitar? {
        for (guitar in guitars) {
            when (parameterToSearch) {
                guitar.getSerialNumber() -> return guitar
                guitar.getPrice().toString() -> return guitar
                guitar.getBuilder() -> return guitar
                guitar.getModel() -> return guitar
                guitar.getType() -> return guitar
                guitar.getBackWood() -> return guitar
                guitar.getTopWood() -> return guitar
            }
        }
        return null
    }
}