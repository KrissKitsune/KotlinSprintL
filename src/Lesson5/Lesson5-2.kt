package Lesson5

const val AGE_OF_MATURITY = 18
const val ACTUAL_YEAR = 2025

fun main() {
    print("Добро пожаловать! Ваш год рождения? ")

    val usersYearOfBirth = (readln()).toInt()
    val userAge = ACTUAL_YEAR - usersYearOfBirth

    val message = if (userAge >= AGE_OF_MATURITY) {
        "Показать экран со скрытым контентом"
    } else {
        "Вернуться на главный экран"
    }
    println(message)

}