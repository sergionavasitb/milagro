package BUCLES

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
//
    repeat(casos) {

        var hpmob = scanner.nextInt()
        val atkrammus = scanner.nextInt()
        val atktwitch = scanner.nextInt()
        var ronda = 1
        var kill =""
        while (hpmob >0 ) {
            hpmob -= atkrammus
            if (hpmob <=0){
                kill= "RAMMUS $ronda"
            }else{
                hpmob -= atktwitch
                if (hpmob <=0){
                    kill="TWITCH $ronda"
                }

            }
            ronda++
        }
        println(kill)
    }
}
