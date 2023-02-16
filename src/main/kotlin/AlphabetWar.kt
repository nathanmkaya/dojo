
fun alphabetWar(fight: String): String {
    val rightSide = mapOf('m' to 4, 'q' to 3, 'd' to 2, 'z' to 1)
    val leftSide = mapOf('w' to 4, 'p' to 3, 'b' to 2, 's' to 1)
    val rightPower = fight.filter { it in rightSide.keys }.sumOf { rightSide.getOrDefault(it, 0) }
    val leftPower = fight.filter { it in leftSide.keys }.sumOf { leftSide.getOrDefault(it, 0) }
    return when {
        rightPower > leftPower -> "Right side wins!"
        leftPower > rightPower -> "Left side wins!"
        else -> "Let's fight again!"
    }
}
