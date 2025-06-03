package Matrius

import java.util.*

fun main(){

    val scanner= Scanner(System.`in`)
    val Nposicions =scanner.nextInt()

    val matriu= Array(Nposicions){IntArray(Nposicions){0}} //fem una matriu de NxN que si inicia a 0

    for(i in 0 until Nposicions){// recorre totes les files
        for (j in 0 until Nposicions){// recorre totes les columnes
            matriu[i][j]=0
            if (i==j){
                matriu[i][j]=1
            }
            print(matriu[i][j])
        }

        println()
    }
}