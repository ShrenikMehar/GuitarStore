package org.example

class Inventory(private val guitars: MutableList<Guitar>) {
    fun addGuitar(
         serialNumber: String,
         price: Double,
         builder: Builder,
         model: String,
         type: Type,
         backWood: Wood,
         topWood: Wood
    ) {
         guitars.addLast(
             Guitar(serialNumber, price, builder, model, type, backWood, topWood)
         )
     }

    fun getGuitar(serialNumber: String): Guitar? {
        for (guitar in guitars)
            if (guitar.serialNumber == serialNumber) return guitar
        return null
    }

    fun search(parameterToSearch: Any): Guitar? {
        for (guitar in guitars) {
            when (parameterToSearch) {
                guitar.serialNumber -> return guitar
                guitar.price -> return guitar
                guitar.builder -> return guitar
                guitar.model -> return guitar
                guitar.type -> return guitar
                guitar.backWood -> return guitar
                guitar.topWood -> return guitar
            }
        }
        return null
    }
}