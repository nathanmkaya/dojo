import kotlin.test.Test
import kotlin.test.assertEquals

class GoingToTheCinemaTest {

    private fun testing(actual: Int, expected: Int) {
        assertEquals(expected, actual)
    }

    @Test
    fun test1() {
        println("Fixed Tests: movie")
        testing(movie(500, 15, 0.9), 43)
        testing(movie(100, 10, 0.95), 24)
    }
}
