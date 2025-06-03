package condicionales
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val X = scanner.nextInt()
    val Y = scanner.nextInt()
    if (X==0 && Y==0) {
        println("1,2,3,4")
    }else if (X<0 && Y==0){
        println("2,3")
    }else if (X>0 && Y==0) {
        println("1,4")
    }else if (X==0 && Y<0) {
        println("3,4")
    } else if (X==0 && Y>0) {
        println("1,2")
    }else if (X>0 && Y>0) {
        println("1")
    }else if (X<0 && Y>0) {
        println("2")
    }else if (X<0 && Y<0) {
        println("3")
    }  else if (X>0 && Y<0) {
        println("4")
    }
}