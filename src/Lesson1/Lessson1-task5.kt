package Lesson1
const val MULTIPLICITY_OF_TIME = 60
fun main() {
    val timeInSpace = 6480
    val minutes = timeInSpace / MULTIPLICITY_OF_TIME % MULTIPLICITY_OF_TIME
    val hours = timeInSpace / (MULTIPLICITY_OF_TIME*MULTIPLICITY_OF_TIME)
    val sec = timeInSpace % MULTIPLICITY_OF_TIME
    val formatTime = String.format("%02d:%02d:%02d", hours, minutes, sec)
    println("Время, проведенное Гагариным в космосе: $formatTime")
}