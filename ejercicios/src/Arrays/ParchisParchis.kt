package Arrays

import java.util.*

fun main(){
    val scanner= Scanner(System.`in`)
    val casos= scanner.nextInt()

    repeat(casos){

        var posicio= scanner.nextInt()  //la posicio a l'inici del joc
        var tirades= IntArray(3){scanner.nextInt()}// fem array per llegir les 3 tirades
        for(i in tirades){
            if(posicio<8){// si ni s'arribat a la casella 8 es pot seguir avançant
                posicio += i
                if(posicio>=8){// si no tornar enerrere
                  posicio= 8-(posicio-8)// efecte rebote per tornar enrrere
                }
            }
        }
        println(posicio)
    }
}
