
fun makeComplement(dna: String): String = dna.map {
    when (it) {
        'T' -> 'A'
        'A' -> 'T'
        'C' -> 'G'
        'G' -> 'C'
        else -> Unit
    }
}.joinToString("")
