package BUCLES


import java.util.Scanner

fun main(){
    val scanner= Scanner(System.`in`)
    val casos= scanner.nextLine().toInt()


    repeat(casos){

        var nom=scanner.nextLine()
        println(nom)
    }
}