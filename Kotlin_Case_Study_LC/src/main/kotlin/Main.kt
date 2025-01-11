fun main(args: Array<String>) {
    println("Hello World!")

    // Primjer eksplicitnog definiranja tipa i automatske dedukcije tipa
    val broj: Int = 42   // Eksplicitno definiranje tipa
    var ime = "Ana"      // Automatska dedukcija tipa (String)
    println("Broj: $broj, Ime: $ime")

    // Primjer lambda funkcije
    val kvadrat = { x: Int -> x * x }  // Lambda funkcija koja vraća kvadrat broja
    println("Kvadrat broja 5: ${kvadrat(5)}")

    // Primjer automatski generiranih metoda u data klasi
    data class Osoba(val ime: String, val dob: Int)
    val osoba = Osoba("Marko", 30)
    println("Osoba: $osoba")  // Automatski generirana toString metoda

    // Primjer null sigurnosti
    var nullableIme: String? = null  // Varijabla koja može biti null
    println("Duljina imena: ${nullableIme?.length ?: "nije definirano"}")  // Sigurno pristupanje

    // Primjer petlje preko kolekcije
    val kolekcija = listOf(1, 2, 3, 4, 5)
    for (item in kolekcija) {
        println("Element kolekcije: $item")
    }

    // Primjer proširive funkcije
    fun String.reversedAndUpper(): String = this.reversed().uppercase()
    val original = "kotlin"
    println("Original: $original, Obrnuto i veliko: ${original.reversedAndUpper()}")

    // Primjer interpolacije stringova
    println("Dobrodošao, $ime!")  // Ispisuje: Dobrodošao, Ana!

    // Paradigma: Objektno-orijentirano programiranje - Klase i objekti
    class Automobil(val marka: String, val model: String) {
        fun start() = println("$marka $model se pokreće!")
    }
    val auto = Automobil("Tesla", "Model S")
    auto.start()  // Ispisuje: Tesla Model S se pokreće!

    // Paradigma: Objektno-orijentirano programiranje - Sučelja
    interface Vozilo {
        fun vozi()
    }
    class Bicikl : Vozilo {
        override fun vozi() = println("Bicikl vozi!")
    }
    val bicikl = Bicikl()
    bicikl.vozi()  // Ispisuje: Bicikl vozi!

    // Paradigma: Funkcionalno programiranje - Lambda izrazi
    val filtrirajPozitivne = { brojevi: List<Int> -> brojevi.filter { it > 0 } }
    val brojevi = listOf(-1, 2, -3, 4)
    println(filtrirajPozitivne(brojevi))  // Ispisuje: [2, 4]

    // Paradigma: Funkcionalno programiranje - Nepromjenjive kolekcije
    val originalList = listOf(1, 2, 3)
    val kopija = originalList + 4  // Stvara novu listu
    println("Original: $originalList, Kopija: $kopija")

    // Paradigma: Proceduralno programiranje - Funkcije
    fun ispisiPozdrav(ime: String) {
        println("Dobrodošao, $ime!")
    }
    ispisiPozdrav("Ana")  // Ispisuje: Dobrodošao, Ana!

    // Paradigma: Proceduralno programiranje - Kontrolne strukture
    val brojKontrole = 5
    when (brojKontrole) {
        in 1..10 -> println("Broj je u rasponu od 1 do 10")
        else -> println("Broj nije u rasponu")
    }

    // Dodani primjeri:

    // Primjer null sigurnosti
    var ime: String? = null  // Varijabla koja može biti null
    val duljina = ime?.length ?: "Nema vrijednosti"  // Sigurno pristupanje null vrijednosti
    println(duljina)  // Ispisuje: Nema vrijednosti

    // Proširiva funkcija
    fun String.isPalindrome(): Boolean {
        return this == this.reversed()
    }

    println("radar".isPalindrome())  // Ispisuje: true

    // Kotlin korutine (Concurrency)
    import kotlinx.coroutines.*

            runBlocking {
                launch {
                    delay(1000L)
                    println("Hello from coroutine!")
                }
                println("Start")
            }
}