import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class OppositesAttractTest {
    @Test
    fun testLoveFun() {
        assertTrue(loveFun(1, 4))
        assertFalse(loveFun(2, 2))
        assertTrue(loveFun(0, 1))
        assertFalse(loveFun(0, 0))
    }
}
