package Matrius

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val files = scanner.nextInt()
    val columnes = scanner.nextInt()
    scanner.nextLine()// salt de linia

    val tauler = Array(files) {
        scanner.nextLine().map { it.digitToInt() }//converteix cada caracter ('0'o'1') a numero
            .toIntArray()// es guarda al tauler com fila
    }
    val novaGeneracio = Array(files) { IntArray(columnes) }// es guarden els resultats despres de lkes regles
    //representem les 8 direccions que envoltan la celula
    val veïns = listOf(
        -1 to -1, -1 to 0, -1 to 1,
        0 to -1,          0 to 1,
        1 to -1,  1 to 0, 1 to 1
    )
    // fem un bucle per aplicar les regles del joc
    for (f in 0 until files) {
        for (c in 0 until columnes) {
            val veinsVius = veïns.count { (df, dc) ->
                val nf = f + df
                val nc = c + dc
                nf in 0 until files && nc in 0 until columnes && tauler[nf][nc] == 1
            }

            novaGeneracio[f][c] = if (
                (tauler[f][c] == 1 && veinsVius in 2..3) ||
                (tauler[f][c] == 0 && veinsVius in 2..3)
            ) 1 else 0
        }
    }

    //imprimir la nova generaco
    for (fila in novaGeneracio) {
        for (valor in fila) print(valor)
        println()
    }
}