data class Point(val x: Double, val y: Double)

fun orientation(p: Point, q: Point, r: Point): Int {
    val val = (q.y - p.y) * (r.x - q.x) - (q.x - p.x) * (r.y - q.y)
    return when {
        val == 0.0 -> 0
        val > 0 -> 1
        else -> 2
    }
}

fun doIntersect(p1: Point, q1: Point, p2: Point, q2: Point): Boolean {
    val o1 = orientation(p1, q1, p2)
    val o2 = orientation(p1, q1, q2)
    val o3 = orientation(p2, q2, p1)
    val o4 = orientation(p2, q2, q1)

    return (o1 != o2 && o3 != o4)
}
