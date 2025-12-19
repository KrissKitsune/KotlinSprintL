package Lesson5

fun main() {
    val randomNum1 = (1..10).random()
    val randomNum2 = (1..10).random()
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