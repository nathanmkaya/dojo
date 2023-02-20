import kotlin.math.ceil

fun movie(card: Int, ticket: Int, perc: Double): Int {
    var count = 0
    var systemA = 0
    var systemB = card.toDouble()
    var previousTicket = ticket.toDouble()
    while (systemA <= ceil(systemB)) {
        systemA += ticket
        previousTicket *= perc
        systemB += previousTicket
        count++
    }
    return count
}
