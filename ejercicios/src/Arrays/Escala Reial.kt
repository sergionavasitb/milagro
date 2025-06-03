package Arrays

import java.util.Scanner

fun main(){
    val scanner=Scanner(System.`in`)
    val casos =  scanner.nextInt()

    repeat(casos) {

        val cartes = IntArray(7) {scanner.nextInt()}//creem un array de 7 espais y les omplim amb els valors que diguem, posem {scanner.nextInt()}
        val contCartes = IntArray(14)//Array de 14 posisions(0 al 13)ñ
         // creem el bucle per pasar per totes les cartes i cobtarles
        for (carta in cartes) {
            contCartes[carta]++
        }
        //comprovem si el jugador te una escala reial
        val escalaReial = contCartes[10] > 0 && contCartes[11] > 0 && contCartes[12] > 0 && contCartes[13] > 0 && contCartes[1] > 0
        var escala = false
        for (i in 1..9) {
            if (contCartes[i] > 0 && contCartes[i + 1] > 0 && contCartes[i + 2] > 0 && contCartes[i + 3] > 0 && contCartes[i + 4] > 0) {
                escala = true
            }
        }
        when {
            escalaReial -> println("ESCALA REIAL")
            escala -> println("ESCALA")
            else -> println("NO")
        }

    }
}