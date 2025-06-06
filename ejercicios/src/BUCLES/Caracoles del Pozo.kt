package BUCLES


import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
    repeat(casos){
        val profunditat= scanner.nextInt()
        val metresDia= scanner.nextInt()
        val metresNit= scanner.nextInt()
        var alturacargol=0
        var dias=0
        var continuar = true

        if (metresDia<=metresNit && metresDia<profunditat) {
            println("NO")
        }else{
            while (continuar){
                dias++
                alturacargol+= metresDia

                if(alturacargol>= profunditat){
                    continuar = false
                }else{
                    alturacargol-= metresNit

                }
//
            }
            println(dias)
        }


    }
}