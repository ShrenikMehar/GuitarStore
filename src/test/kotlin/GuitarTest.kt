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

        inventory.addGuitar(
            "V69420",
            1999.95,
            Builder.FENDER,
            "Cratos",
            Type.ACOUSTIC,
            Wood.SITKA,
            Wood.BRAZILIAN_ROSEWOOD
        )

        val guitarsList = mutableSetOf(
            Guitar(
                "V95693",
                1499.95,
                Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER
            ),
            Guitar(
                "V69420",
                1999.95,
                Builder.FENDER,
                "Cratos",
                Type.ACOUSTIC,
                Wood.SITKA,
                Wood.BRAZILIAN_ROSEWOOD
            )
        )

        val getGuitarThroughSearch = inventory.search(Builder.FENDER)

        assertEquals(getGuitarThroughSearch,guitarsList)
    }
}
