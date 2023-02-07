import kotlin.test.Test
import kotlin.test.assertEquals

class AreaOrPerimeterTest {

    @Test
    fun testAreaOrPerimeter() {
        assertEquals(4, Solution.areaOrPerimeter(2, 2))
        assertEquals(32, Solution.areaOrPerimeter(6, 10))
    }
}
