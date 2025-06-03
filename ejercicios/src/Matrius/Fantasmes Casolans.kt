import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val casos = scan.nextInt()

    repeat(casos) {
        val f = scan.nextInt()    // alçada de la casa
        val c = scan.nextInt()    // amplada de la casa
        val k = scan.nextInt()    // número de fantasmes

        // llegim les posicions dels fantasmes
        val fantasmes = Array(k) {
            val x = scan.nextInt()
            val y = scan.nextInt()
            Pair(x, y)
        }

        val blau = fantasmes[0] // El fantasma que controlem

        // generem les quatre posicions adjacents (dalt, baix, esquerra, dreta)
        val moviments = listOf(
            Pair(blau.first - 1, blau.second),
            Pair(blau.first + 1, blau.second),
            Pair(blau.first, blau.second - 1),
            Pair(blau.first, blau.second + 1)
        )

        // comprovem si com a mínim una de les posicions es valida
        val potMoure = moviments.any { (x, y) ->
            x in 1 until f - 1 && y in 1 until c - 1 && // dins de la casa
                    fantasmes.none { it.first == x && it.second == y } // que no hi hagi cap fantasma
        }

        println(if (potMoure)
            "THIS IS FINE"
        else "OH NO")
    }
}
