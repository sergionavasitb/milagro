package Arrays
import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val casos= scanner.nextInt()


    repeat(casos) {
        val import = scanner.nextInt()
        val llista = mutableListOf<Int>() //fem una llista mutable per podwer anar guardant les apostes
        var aposta = scanner.nextInt()// primera aposta

        while (aposta > 0) {
            llista.add(aposta) //afegim l'aposta a la llista
            aposta = scanner.nextInt() //nova aposta
        }

        llista.sort() //ordenar la llista de menor a major
        var solicitud = 0// apostes que podem agafar
        var sumaImport = 0// suma acumulada de leew apostes

        for(i in llista){// fem un bucle per veure si les aposta(i) no superan l'import
            if (sumaImport + i <= import){
                sumaImport += i//s'accepta
                solicitud++
            }
        }
        println(solicitud)
    }
}