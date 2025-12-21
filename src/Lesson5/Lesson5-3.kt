package Lesson5

import kotlin.system.exitProcess

const val WIN_FIRST_NUM = 15
const val WIN_SECOND_NUM = 33
const val MIN_WIN_NUM = 0
const val MAX_WIN_NUM = 42

fun main() {

    println(
        "Вы участвуете в лотерее! Вам нужно ввести два числа в диапазоне от 0 до 42!\n Ваше первое число? "
    )
    val userFirstNum = readln().toInt()
    if (userFirstNum !in MIN_WIN_NUM..MAX_WIN_NUM) {
        println("Вы ввели ${userFirstNum}, оно не в диапазоне от 0 до 42!")
        exitProcess(1)
    }
    println("Ваше второе число? ")
    val userSecondNum = readln().toInt()
    if (userSecondNum !in MIN_WIN_NUM..MAX_WIN_NUM) {
        println("Вы ввели ${userSecondNum}, оно не в диапазоне от 0 до 42!")
        exitProcess(1)
    }

    val firstNumCheck = (userFirstNum == WIN_FIRST_NUM) || (userFirstNum == WIN_SECOND_NUM)
    val secondNumCheck = (userSecondNum == WIN_SECOND_NUM) || (userSecondNum == WIN_FIRST_NUM)

    val winMessage = if ((firstNumCheck && secondNumCheck) && (userFirstNum != userSecondNum)) {
        "Поздравляем! Вы выиграли главный приз!"
    } else if (firstNumCheck || secondNumCheck) {
        "Вы выиграли утешительный приз!"
    } else {
        "Увы, но вы проиграли, может в следующий раз повезет :("
    }
    println(winMessage)
}
