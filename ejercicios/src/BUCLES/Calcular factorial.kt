package BUCLES


import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextLine().toInt()


    repeat(casos) {
        val numero= scanner.nextInt()
        var fact= 1L
        for(i in 1..numero){
            fact *= i
        }
        println(fact)
    }
}