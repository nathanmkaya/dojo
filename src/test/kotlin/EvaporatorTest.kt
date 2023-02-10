import kotlin.test.Test
import kotlin.test.assertEquals

class EvaporatorTest {
    @Test
    fun testEvaporator() {
        assertEquals(22, evaporator(10.0, 10.0, 10.0))
        assertEquals(29, evaporator(10.0, 10.0, 5.0))
        assertEquals(59, evaporator(100.0, 5.0, 5.0))
    }
}
