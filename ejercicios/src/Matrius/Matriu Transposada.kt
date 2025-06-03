package Matrius
import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    val columna = scanner.nextInt()
    val fila = scanner.nextInt()
//fem una matriu columna x fila i la inicialitzem llegint valors d'entrada
    val matriu = Array(columna) { IntArray(fila) { scanner.nextInt() } }

//recorrem la matriu per columnes (i) i files (j) per imprimir la matriu transposada
    for (i in 0 until fila) {
        for (j in 0 until columna) {
            print("${matriu[j][i]} ")  // imprimeix el valor a la posicio [j][i] amb un espai
        }
        println()
    }
}