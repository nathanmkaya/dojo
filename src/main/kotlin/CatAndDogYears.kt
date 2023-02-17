
fun calculateYears(years: Int): Array<Int> =
    when (years) {
        1 -> arrayOf(years, 15, 15)
        2 -> arrayOf(years, 24, 24)
        else -> {
            val multiplier = years - 2
            arrayOf(years, 24 + 4 * multiplier, 24 + 5 * multiplier)
        }
    }
