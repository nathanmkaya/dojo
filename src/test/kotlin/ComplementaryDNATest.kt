import kotlin.test.Test
import kotlin.test.assertEquals

class ComplementaryDNATest {
    @Test
    fun testMakeComplement() {
        assertEquals("TTTT", makeComplement("AAAA"))
        assertEquals("TAACG", makeComplement("ATTGC"))
    }
}
