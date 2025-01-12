fun main() {
    // Traži unos korisnika za potrošnju goriva, prijeđene kilometre i cijenu goriva
    println("Unesite prosječnu potrošnju goriva (litara na 100 km):")
    val consumption = readLine()?.toDoubleOrNull() ?: return println("Nevažeći unos.")

    println("Unesite broj kilometara koje planirate prijeći:")
    val distance = readLine()?.toDoubleOrNull() ?: return println("Nevažeći unos.")

    println("Unesite cijenu goriva po litri:")
    val fuelPrice = readLine()?.toDoubleOrNull() ?: return println("Nevažeći unos.")

    // Izračun potrebnog goriva i ukupnog troška
    val fuelNeeded = calculateFuelNeeded(consumption, distance)
    val totalCost = calculateTotalCost(fuelNeeded, fuelPrice)

    // Ispis rezultata
    println("\nRezultati:")
    println("Za $distance km trebate ${"%.2f".format(fuelNeeded)} litara goriva.")
    println("Ukupan trošak goriva bit će ${"%.2f".format(totalCost)} kn.")
}

// Funkcija za izračun potrebnog goriva
fun calculateFuelNeeded(consumption: Double, distance: Double): Double {
    return (consumption / 100) * distance
}

// Funkcija za izračun ukupnog troška
fun calculateTotalCost(fuelNeeded: Double, fuelPrice: Double): Double {
    return fuelNeeded * fuelPrice
}
