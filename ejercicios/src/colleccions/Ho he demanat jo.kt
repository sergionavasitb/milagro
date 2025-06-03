import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt() // llegim el nombre de casos
    scanner.nextLine() // saltem la linia buida despres del nombre

    repeat(casos) {
        val n = scanner.nextLine().toInt() // cada quants aperitius roba e
        val aperitius = scanner.nextLine().split(" ") // llegim la llista d'aperitius
        val resultat = mutableListOf<String>() // llista on guardarem els que no son robats

        // afegim els aperitius que no son a posicio multiple de n
        for (i in 0 until aperitius.size) {
            if ((i + 1) % n != 0) { // si no es multiple de n, no es roba
                resultat.add(aperitius[i])
            }
        }

        // imprimim la llista resultant sense joinToString
        for (i in 0 until resultat.size) {
            print(resultat[i])
            if (i != resultat.size - 1) print(" ") // afegim espai si no es l'ultim
        }
        println() // nova linia al final de cada cas
    }
}
