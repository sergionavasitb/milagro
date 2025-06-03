package colleccions

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt() // nombre de linies
    scanner.nextLine() // salt de linia

    val espatllat = scanner.nextLine() // nom del diferencial espatllat
    val estat = mutableMapOf<String, Boolean>() // guarda l'estat de cada diferencial

    for (i in 1 until n) {
        val nom = scanner.nextLine()

        if (nom == espatllat) {
            // si s'activa el diferencial espatllat, tots els altres cauen (es posen a false)
            for ((clau, _) in estat) {
                estat[clau] = false
            }
        } else {
            // canvia l'estat: si no existeix es posa a true, si existeix es canvia
            estat[nom] = !(estat[nom] ?: false)
        }
    }

    var comptaTrue = 0
    var comptaFalse = 0

    for ((clau, valor) in estat) {
        if (clau != espatllat) {
            if (valor) comptaTrue++
            else comptaFalse++
        }
    }

    println("$comptaTrue $comptaFalse")
}
