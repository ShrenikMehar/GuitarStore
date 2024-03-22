package org.example

class Inventory(private val guitars: MutableList<Guitar>) {
    fun addGuitar(
         serialNumber: String,
         price: Double,
         specs: GuitarSpecs
    ) {
         guitars.addLast(
             Guitar(serialNumber, price, specs)
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
                guitar.specs.builder -> searchedGuitars.add(guitar)
                guitar.specs.model -> searchedGuitars.add(guitar)
                guitar.specs.type -> searchedGuitars.add(guitar)
                guitar.specs.backWood -> searchedGuitars.add(guitar)
                guitar.specs.topWood -> searchedGuitars.add(guitar)
            }
        }
        return searchedGuitars
    }
}