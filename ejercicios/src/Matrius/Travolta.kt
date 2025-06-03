import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val fila = scanner.nextInt()
    val columna = scanner.nextInt()
    val nomT = scanner.nextInt()

    //  matriu de files i columnes inicialitzada amb zeros
    val matriu = Array(fila) { IntArray(columna) }

    // omplim la matriu amb els valors que anem llegint
    for (i in 0 until fila) {
        for (j in 0 until columna) {
            matriu[i][j] = scanner.nextInt()
        }
    }

    // iniciem amb -1 perque encara no tenim resultat
    var resposta = -1

    // recorrem la matriu per buscar files on el valor a la columna 'j' estigui envoltat per 'nomT' a la seva esquerra i dreta
    for (i in 0 until fila) {
        for (j in 1 until columna - 1) { // evitem la primera i ultima columna per no sortir-nos de rang
            if (matriu[i][j - 1] == nomT && matriu[i][j + 1] == nomT) {
                // Si la condicio es compleix, guardem el valor de la posicio central (j) a 'resposta'
                resposta = matriu[i][j]
            }
        }
    }

    if (resposta != -1) {
        println(resposta)
    } else {
        println("NO")
    }
}
