
fun accum(s: String): String = s.mapIndexed { index, c -> c.lowercase().repeat(index + 1).capitalize() }.joinToString("-")
