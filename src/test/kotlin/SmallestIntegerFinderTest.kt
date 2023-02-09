import kotlin.test.Test
import kotlin.test.assertEquals

class SmallestIntegerFinderTest {

    @Test
    fun testFindSmallestInt() {
        assertEquals(10, findSmallestInt(listOf(15, 20, 10, 17, 22, 9001)))
    }
}
