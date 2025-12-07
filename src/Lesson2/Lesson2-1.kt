package Lesson2

fun main() {
    val students = 4
    val mark1 = 3.0
    val mark2 = 4
    val mark3 = 3
    val mark4 = 5
    val middlmark = (mark1 + mark2 + mark3 + mark4) / students
    print("Количество студентов в классе - $students, средний бал: ${String.format("%2.2f", middlmark)}")
}