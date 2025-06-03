package colleccions

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt() // llegim el nombre de casos
    scanner.nextLine() // saltem la linia buida

    repeat(casos) {
        val k = scanner.nextInt() // nombre de votacions en aquest cas
        scanner.nextLine() // saltem la linia

        val vots = mutableMapOf<String, Int>() // mapa per guardar els vots

        // llegim cada mapa i acumulem vots
        repeat(k) {
            val mapa = scanner.nextLine()
            vots[mapa] = vots.getOrDefault(mapa, 0) + 1
        }

        // trobem el mapa amb mes vots
        var guanyador = ""
        var maxVots = 0
        for ((mapa, comptador) in vots) {
            if (comptador > maxVots) {
                maxVots = comptador
                guanyador = mapa
            }
        }

        println(guanyador) // imprimim el guanyador
    }
}
