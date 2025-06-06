package condicionales

import java.util.*


fun main(){
    val scanner= Scanner(System.`in`)
    val num= scanner.nextInt()

    when(num){
       in 0..4-> println("Suspes")
        in 5..6-> println("Aprovat")
        in 7..8-> println("Notable")
        in 9..8->  println("Excelent")
    }
}//