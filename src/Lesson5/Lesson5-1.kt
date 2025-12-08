package Lesson5

import kotlin.random.Random

fun main() {
    val randomNum1 = (Random.Default).nextInt(11)
    val randomNum2 = (Random.Default).nextInt(11)
    print("Докажите, что вы не бот.\nРешите уравнение: $randomNum1 + $randomNum2 = ")

    val enteredTotal = readln().toInt()
    val calculatedTotal = randomNum1 + randomNum2

    val helloMessage = if (enteredTotal == calculatedTotal) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен!"
    }
    print(helloMessage)
}