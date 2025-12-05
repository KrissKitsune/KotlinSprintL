package Lesson1

fun main() {
    val seconds = 6480
    val minutes = seconds / 60 % 60
    val hours = seconds / 3600
    val sec = seconds % 60
    val formatTime = String.format("%02d:%02d:%02d", hours, minutes, sec)
    println("Время, проведенное Гагариным в космосе: $formatTime")
}