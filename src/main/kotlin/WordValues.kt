object WordValues {
    fun nameValue(arr: Array<String>): IntArray = arr.map { s ->
        s.sumOf {
            ('a'..'z').toList().indexOf(it) + 1
        }
    }.mapIndexed { index, i -> i * (1 + index) }.toIntArray()
}
