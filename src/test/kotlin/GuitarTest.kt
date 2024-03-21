import org.example.Guitar
import org.example.Inventory
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GuitarTest {
    @Test
    fun `We should be add any guitar to inventory`() {

        val inventory = Inventory(mutableListOf())

        inventory.addGuitar(
            "V95693",
            1499.95,
            "Fender",
            "Stratocastor",
            "Electric",
            "Alder",
            "Alder"
        )

        val guitar = Guitar(
            "V95693",
            1499.95,
            "Fender",
            "Stratocastor",
            "Electric",
            "Alder",
            "Alder"
        )

        val getGuitarThroughSerialNumber = inventory.getGuitar("V95693")

        assertEquals(getGuitarThroughSerialNumber!!.getSerialNumber(),guitar.getSerialNumber())
    }

    @Test
    fun `We should be search any guitar to inventory`() {

        val inventory = Inventory(mutableListOf())

        inventory.addGuitar(
            "V95693",
            1499.95,
            "Fender",
            "Stratocastor",
            "Electric",
            "Alder",
            "Alder"
        )

        val guitar = Guitar(
            "V95693",
            1499.95,
            "Fender",
            "Stratocastor",
            "Electric",
            "Alder",
            "Alder"
        )

        val getGuitarThroughSearch = inventory.search("Fender")

        assertEquals(getGuitarThroughSearch!!.getSerialNumber(),guitar.getSerialNumber())
        assertEquals(getGuitarThroughSearch.getPrice(),guitar.getPrice())
        assertEquals(getGuitarThroughSearch.getBuilder(),guitar.getBuilder())
        assertEquals(getGuitarThroughSearch.getModel(),guitar.getModel())
        assertEquals(getGuitarThroughSearch.getType(),guitar.getType())
        assertEquals(getGuitarThroughSearch.getBackWood(),guitar.getBackWood())
        assertEquals(getGuitarThroughSearch.getTopWood(),guitar.getTopWood())
    }
}
