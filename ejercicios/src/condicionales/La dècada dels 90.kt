package condicionales

import java.util.*

fun main(){
    val scanner= Scanner(System.`in`)
    val num= scanner.nextInt()

    when {
        num in 0..10000 && num % 100 in 90..99 -> {
            println("SI")


        }

        else -> {
            println("NO")
        }
    }
}//