import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class InvertValuesKtTest {

    @Test
    fun invert() {
        assertArrayEquals(intArrayOf(-1, -2, -3, -4, -5), invert(intArrayOf(1, 2, 3, 4, 5)))
        assertArrayEquals(intArrayOf(-1, 2, -3, 4, -5), invert(intArrayOf(1, -2, 3, -4, 5)))
        assertArrayEquals(intArrayOf(), invert(intArrayOf()))
        assertArrayEquals(intArrayOf(0), invert(intArrayOf(0)))
    }
}
