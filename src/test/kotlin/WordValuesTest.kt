import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

class WordValuesTest {

    @Test
    fun testWordValues() {
        assertArrayEquals(intArrayOf(6, 24), WordValues.nameValue(arrayOf("abc", "abc abc")))
        assertArrayEquals(intArrayOf(88, 12, 225), WordValues.nameValue(arrayOf("codewars", "abc", "xyz")))
        assertArrayEquals(
            intArrayOf(351, 282, 330),
            WordValues.nameValue(arrayOf("abcdefghijklmnopqrstuvwxyz", "stamford bridge", "haskellers")),
        )
    }
}
