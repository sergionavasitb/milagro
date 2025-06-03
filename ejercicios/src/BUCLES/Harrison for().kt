package BUCLES

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val diners = scanner.nextInt()
    //usem step per saltar de m9illio en millio fins el resultat que volem
    for(i in 1000000..diners step 1000000){
        println(i)
    }
}