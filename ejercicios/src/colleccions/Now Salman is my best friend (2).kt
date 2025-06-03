package colleccions

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt() // nombre de casos de prova
    scanner.nextLine() // saltem a la seguent linia

    repeat(n) {
        val k = scanner.nextInt() // nombre de linies per al cas
        scanner.nextLine()

        val amics = mutableMapOf<String, String>() // mapa per guardar millor amic

        for (i in 0 until k - 1) {
            val parts = scanner.nextLine().split(" ")
            val a = parts[0]
            val b = parts[1]
            amics[a] = b
            amics[b] = a
        }

        val nom = scanner.nextLine() // nom del qual volem saber el millor amic
        println(amics[nom]) // imprimim el millor amic segons l'ultim que s'ha dit
    }
}
