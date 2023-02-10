
fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {
    var percentageLeft = 100.0
    var days = 0
    while (percentageLeft > threshold) {
        percentageLeft -= percentageLeft * (evap_per_day / 100.00)
        days++
    }
    return days
}
