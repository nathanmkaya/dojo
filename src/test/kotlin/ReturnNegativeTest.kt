import kotlin.test.Test
import kotlin.test.assertEquals

class ReturnNegativeTest {

    @Test
    fun testMakeNegative() {
        assertEquals(-42, makeNegative(42))
    }
}
