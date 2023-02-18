
fun people(busStops: Array<Pair<Int, Int>>): Int = busStops.sumOf { it.first - it.second }
