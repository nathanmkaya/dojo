import kotlin.test.Test
import kotlin.test.assertEquals

class ReversedSequenceTest {

    @Test
    fun testReversedSeq() {
        assertEquals(listOf(5, 4, 3, 2, 1), reverseSeq(5))
    }
}
