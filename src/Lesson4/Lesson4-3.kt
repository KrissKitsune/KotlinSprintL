package Lesson4

fun main() {
    val sunnyToday: Boolean = true
    val tentIsOpened: Boolean = true
    val airHumidity: Int = 20
    val season: String = "зима"

    val suitableСonditions = sunnyToday && tentIsOpened && (airHumidity == 20) && (season != "зима")

    println("Благоприятные ли условия сейчас для роста бобовых? $suitableСonditions")
}