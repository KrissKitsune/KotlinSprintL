package Lesson1

fun main() {
    val year = 1961
    var hour = 9
    var minute = 7

    println(String.format("Время взлета: %4d %02d:%02d", year, hour, minute))

    hour = 10
    minute = 55

    println(String.format("Время посадки: %4d %02d:%02d", year, hour, minute))
}