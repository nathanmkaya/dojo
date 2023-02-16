import kotlin.test.Test
import kotlin.test.assertEquals

class AlphabetWarTest {
    @Test
    fun testAlphabetWar() {
        assertEquals("Right side wins!", alphabetWar("z"))
        assertEquals("Let's fight again!", alphabetWar("zdqmwpbs"))
        assertEquals("Right side wins!", alphabetWar("zzzzs"))
        assertEquals("Left side wins!", alphabetWar("wwwwww"))
    }
}
