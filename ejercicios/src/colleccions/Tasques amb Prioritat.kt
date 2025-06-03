package colleccions

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt() // llegim el nombre de casos
    scanner.nextLine() // saltem la linia buida

    repeat(casos) {
        val parts = scanner.nextLine().split(" ")
        val n = parts[0].toInt() // nombre de tasques
        val k = parts[1].toInt() // posicio que volem saber

        val tasques = mutableListOf<Pair<Int, String>>() // guardem (prioritat, nom)

        repeat(n) {
            val linia = scanner.nextLine().split(" ", limit = 2)
            val prioritat = linia[0].toInt()
            val nom = linia[1]
            tasques.add(Pair(prioritat, nom))
        }

        // ordenem per prioritat (prioritat mes baixa primer)
        tasques.sortBy { it.first }

        // imprimim el nom de la tasca en la posicio k-1 (ja que comencem per 0)
        println(tasques[k - 1].second)
    }
}
