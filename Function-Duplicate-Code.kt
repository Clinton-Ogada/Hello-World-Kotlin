
fun printWeatherDetails(city: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $city")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
}
fun main() {
    printWeatherDetails("Ankara", 27, 31, 82)
    printWeatherDetails("Tokyo", 32, 36, 10)
    printWeatherDetails("Cape Town", 59, 64, 2)
    printWeatherDetails("Guatemala City", 50, 55, 7)
}
