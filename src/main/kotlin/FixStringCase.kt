object FixStringCase {
    fun solve(s: String): String {
        val group = s.groupBy { it.isUpperCase() }.mapValues { it.value.size }
        val toUpper = group.getOrElse(true) { 0 } > group.getOrElse(false) { 0 }
        return if (toUpper) s.uppercase() else s.lowercase()
    }
}
