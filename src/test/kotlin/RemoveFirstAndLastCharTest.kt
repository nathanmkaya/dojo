import kotlin.test.Test
import kotlin.test.assertEquals

class RemoveFirstAndLastCharTest {
    @Test
    fun testRemoveChar() {
        assertEquals("loquen", removeChar("eloquent"))
        assertEquals("ountr", removeChar("country"))
        assertEquals("erso", removeChar("person"))
        assertEquals("lac", removeChar("place"))
    }
}
