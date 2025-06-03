package Arrays

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val casos =scanner.nextInt()

    repeat(casos) {

        val alcada= scanner.nextInt()
        val array = IntArray(alcada)// array per guardar valors
        for (numero in 0 until alcada) {
            array[numero] =scanner.nextInt()// omplim l'array amb el valos que hem ficat
        }
        var alt = 100//detectar valor maxim
        var baix = 220//detectar valor minim
        //fem un bucle per comprovar quin es el valor mes petit i quin el mes gran
        for ( posicion in 0 until alcada){

            if (array[posicion] < baix){
                baix = array[posicion]
            }
            else if ( array[posicion] > alt){
                alt = array[posicion]
            }
        }
        println(alt - baix)
    }
}