import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestEvenOrOdd {
    @Test
    fun testFixed() {
        assertEquals("Even", evenOrOdd(2))
        assertEquals("Even", evenOrOdd(0))
        assertEquals("Odd", evenOrOdd(7))
        assertEquals("Odd", evenOrOdd(1))
    }
}
