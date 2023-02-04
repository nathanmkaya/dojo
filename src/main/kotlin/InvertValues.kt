import kotlin.math.abs

fun invert(array: IntArray): IntArray {
    return array.map { i ->
        if (i > 0) -i else abs(i)
    }.toIntArray()
}
