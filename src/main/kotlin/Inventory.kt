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

    fun search(parameterToSearch: Any): Set<Guitar> {
        val searchedGuitars = mutableSetOf<Guitar>()

        for (guitar in guitars) {
            when (parameterToSearch) {
                guitar.serialNumber -> searchedGuitars.add(guitar)
                guitar.price -> searchedGuitars.add(guitar)
                guitar.builder -> searchedGuitars.add(guitar)
                guitar.model -> searchedGuitars.add(guitar)
                guitar.type -> searchedGuitars.add(guitar)
                guitar.backWood -> searchedGuitars.add(guitar)
                guitar.topWood -> searchedGuitars.add(guitar)
            }
        }
        return searchedGuitars
    }
}