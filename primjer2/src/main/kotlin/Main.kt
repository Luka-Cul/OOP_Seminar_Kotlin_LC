import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1, 101) // Generira slučajni broj između 1 i 100
    var attempts = 0
    var guessedCorrectly = false

    println("Dobrodošli u igru pogađanja broja!")
    println("Pokušajte pogoditi broj između 1 i 100.")

    while (!guessedCorrectly) {
        print("Unesite svoj broj: ")
        val userInput = readLine()?.toIntOrNull()

        if (userInput == null || userInput !in 1..100) {
            println("Molimo unesite valjani broj između 1 i 100.")
            continue
        }

        attempts++
        when {
            userInput < randomNumber -> println("Previše nisko! Pokušajte ponovno.")
            userInput > randomNumber -> println("Previše visoko! Pokušajte ponovno.")
            else -> {
                println("Čestitamo! Pogodili ste broj $randomNumber u $attempts pokušaja.")
                guessedCorrectly = true
            }
        }
    }
}