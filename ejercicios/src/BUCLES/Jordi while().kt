package BUCLES


import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var video = 0
    var strikes = 0
    var contador = 0
    //indiquem al bucle que quan tingui 3 strikes pari
    while (strikes != 3) {
        //indiquem que si es -1 el conti com a strike i si no que el compti com a video normal
        video = scanner.nextInt()
        if (video == -1)
            strikes++
         else contador++

    }
    println(contador)

}