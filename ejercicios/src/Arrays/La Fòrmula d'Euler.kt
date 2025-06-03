import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()

    repeat(casos) {
        val numNombres = scanner.nextInt()
        val nombres = IntArray(numNombres) { scanner.nextInt() }
        nombres.sort() // amb el .sort ordenem el numeros de mes petit a mes gran

        // se suma el primer amb l'ultim i elsegon amb el terçer
        for (i in 0 until numNombres / 2) {
            val suma = nombres[i] + nombres[numNombres - 1 - i]
            print("$suma ")
        }

        println() //perque salti una linia entre cas i cas
    }
}
