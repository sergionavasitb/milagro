package condicionales


import java.util.Scanner

fun main(){
    val scanner= Scanner(System.`in`)
    val edat1= scanner.nextInt()
    val edat2= scanner.nextInt()
    val edat3= scanner.nextInt()
    val edat4= scanner.nextInt()

    if(edat4==edat1 || edat4==edat2 || edat4==edat3){
        println("NO")
    }else{
        println("SI")
    }
}