package condicionales


import java.util.Scanner

fun main(){
    val scanner= Scanner(System.`in`)

    val num1=scanner.nextInt()
    val num2=scanner.nextInt()
    val num3=scanner.nextInt()

    if(num1==num2 && num1==num3 && num2==num3)
        println("SI")
    else{
        println("NO")
    }
}