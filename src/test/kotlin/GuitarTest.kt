import org.example.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GuitarTest {
    @Test
    fun `We should be add any guitar to inventory`() {

        val inventory = Inventory(mutableListOf())

        inventory.addGuitar(
            "V95693",
            1499.95,
            Builder.FENDER,
            "Stratocastor",
            Type.ELECTRIC,
            Wood.ALDER,
            Wood.ALDER
        )

        val guitar = Guitar(
            "V95693",
            1499.95,
            Builder.FENDER,
            "Stratocastor",
            Type.ELECTRIC,
            Wood.ALDER,
            Wood.ALDER
        )

        val getGuitarThroughSerialNumber = inventory.getGuitar("V95693")

        assertEquals(getGuitarThroughSerialNumber!!.serialNumber,guitar.serialNumber)
    }

    @Test
    fun `We should be search any guitar to inventory`() {

        val inventory = Inventory(mutableListOf())

        inventory.addGuitar(
            "V95693",
            1499.95,
            Builder.FENDER,
            "Stratocastor",
            Type.ELECTRIC,
            Wood.ALDER,
            Wood.ALDER
        )

        val guitar = Guitar(
            "V95693",
            1499.95,
            Builder.FENDER,
            "Stratocastor",
            Type.ELECTRIC,
            Wood.ALDER,
            Wood.ALDER
        )

        val getGuitarThroughSearch = inventory.search(Builder.FENDER)

        assertEquals(getGuitarThroughSearch!!.serialNumber,guitar.serialNumber)
        assertEquals(getGuitarThroughSearch.price,guitar.price)
        assertEquals(getGuitarThroughSearch.builder,guitar.builder)
        assertEquals(getGuitarThroughSearch.model,guitar.model)
        assertEquals(getGuitarThroughSearch.type,guitar.type)
        assertEquals(getGuitarThroughSearch.backWood,guitar.backWood)
        assertEquals(getGuitarThroughSearch.topWood,guitar.topWood)
    }
}
