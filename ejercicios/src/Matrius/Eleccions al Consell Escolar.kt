package Matrius

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    val matriu = Array(num) { CharArray(num) { '.' } }// creem una matriu num x num (array i chararray)

    // fem bucles per recorrer totes les celes de la matriu i poder colocar la x
    for (i in 0 until num) {
        for (j in 0 until num) {
            if (i == 0 || i == num - 1 || j == 0 || j == num - 1 || i == j || j == num - 1 - i) {
                matriu[i][j] = 'X'
            }
        }
    }

    // fem altres bucles per poder imprimir la matriu
    for (i in 0 until num) {
        for (j in 0 until num) {
            print(matriu[i][j])
            print(' ') // espai entre caracters
        }
        println() // salt de línia
    }
}
