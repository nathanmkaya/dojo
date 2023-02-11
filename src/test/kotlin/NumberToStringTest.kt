import kotlin.test.Test
import kotlin.test.assertEquals

class NumberToStringTest {

    @Test
    fun testNumberToString() {
        assertEquals("67", numberToString(67))
        assertEquals("123", numberToString(123))
        assertEquals("999", numberToString(999))
    }
}
