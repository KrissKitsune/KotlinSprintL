package Lesson5

fun main() {
    val userName1 = "Zaphod"
    val userPass1 = "PanGalactic"
    var userPass: String
    val userName: String

    println(
        """
                        Внимание, Пассажир.
        |Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "Heart of Gold".
        |Что-ж, введи, пожалуйста, свое имя, чтобы мы могли приступить к процессу входа:""".trimMargin()
    )
    userName = readln()

    if (userName == userName1) {
        println("Приветствую ${userName}, введите, пожалуйста, свой пароль:")
        userPass = readln()
        val isCorrectPass = if (userPass == userPass1) {
            "Ваши данные проверены, и о, чудо, они верны... Пользователь ${userName}, вам разрешено входить на борт корабля \"Heart of Gold\""
        } else "Забыл пароль,${userName}? Доступ запрещен!"
        println(isCorrectPass)
    } else {
        println("Тебя нет в нашей базе данных ${userName}, придется тебя регистрировать... Укажи, пожалуйста, свой пароль для входа")
        userPass = readln()
    }
}