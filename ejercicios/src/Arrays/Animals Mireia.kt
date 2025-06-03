import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner .nextInt()
    scanner .nextLine()
    repeat(casos) {
        val linias =scanner .nextInt()
        scanner .nextLine()
        val array = Array(linias- 1) { scanner.nextLine()}//creem l?array per ficar el animals
        val animalBuscat =scanner .nextLine()//l'animal que volem buscar
        var animalEsta = false //suposem que no esta
        //fem un bucle que recorre tot l'array per veure si esta
        for (animal in array) {
            if (animal == animalBuscat) {
                animalEsta = true // si el trobem es marca
            }
        }
        if (animalEsta) {
            println("SI")
        } else {
            println("NO")
        }
    }
}
