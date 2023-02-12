import kotlin.math.abs

fun mxdiflg(a1: Array<String>, a2: Array<String>): Int {
    var dif = 0
    if (a1.isEmpty() or a2.isEmpty()) return -1
    a1.forEach { first ->
        a2.forEach { second ->
            val calculation = abs(first.length - second.length)
            if (calculation > dif) dif = calculation
        }
    }
    return dif
}
