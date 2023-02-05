
fun sum(numbers: IntArray): Int {
    return numbers.filter { num ->
        num > 0
    }.sum()
}
