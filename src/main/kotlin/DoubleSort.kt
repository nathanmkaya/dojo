object DoubleSort {
    fun dbSort(a: Array<Any>): Array<Any> = (a.filterIsInstance<Int>().sortedBy { it } + a.filterIsInstance<String>().sorted()).toTypedArray()
}
