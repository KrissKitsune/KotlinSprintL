package Lesson5

import kotlin.system.exitProcess
const val MIN_WIN_NUM = 0
const val MAX_WIN_NUM = 42

fun main() {
    val winFirstNum = (MIN_WIN_NUM..MAX_WIN_NUM).random()
    val variableNum = (MIN_WIN_NUM..MAX_WIN_NUM).random()
    val winSecondNum = if (winFirstNum != variableNum) {
        variableNum
    } else (MIN_WIN_NUM..MAX_WIN_NUM).random()
    val winThirdNum = if ((winFirstNum != variableNum) && (winSecondNum != variableNum)) {
        variableNum
    } else (MIN_WIN_NUM..MAX_WIN_NUM).random()

    println("Вы участвуете в лотерее! Вам нужно ввести три разных числа в диапазоне от $MIN_WIN_NUM до $MAX_WIN_NUM !\n Ваше первое число? ")
    val userFirstNum = readln().toInt()
    if (userFirstNum !in MIN_WIN_NUM..MAX_WIN_NUM) {
        println("Вы ввели $userFirstNum, оно не в диапазоне от $MIN_WIN_NUM до $MAX_WIN_NUM !")
        exitProcess(1)
    }

    println("Число принято!\n Ваше второе число? ")
    var userSecondNum = readln().toInt()
    if (userSecondNum !in MIN_WIN_NUM..MAX_WIN_NUM) {
        println("Вы ввели ${userSecondNum}, оно не в диапазоне от $MIN_WIN_NUM до $MAX_WIN_NUM !")
        exitProcess(1)
    } else if (userFirstNum != userSecondNum) {
        println("Число принято!")
    } else {
        println("Попробуйте еще раз...")
        userSecondNum = readln().toInt()
    }

    println("Ваше третье число? ")
    var userThirdNum = readln().toInt()
    if (userThirdNum !in MIN_WIN_NUM..MAX_WIN_NUM) {
        println("Вы ввели ${userThirdNum}, оно не в диапазоне от $MIN_WIN_NUM до $MAX_WIN_NUM !")
        exitProcess(1)
    } else if ((userThirdNum != userFirstNum) && (userThirdNum != userSecondNum)) {
        println("Число принято!")
    } else {
        println("Попробуйте еще раз...")
        userThirdNum = readln().toInt()
    }
    val listWinNum = listOf(winFirstNum, winSecondNum, winThirdNum)
    val listUsersNum = listOf(userFirstNum, userSecondNum, userThirdNum)

    val matchesNum = listWinNum.intersect(listUsersNum.toSet())
    val matchesCount = matchesNum.count()

    val resultText = when (matchesCount) {
        3 -> "Вы выйграли и получаете ДЖЕКПОТ!"
        2 -> "Вы угадали два числа из трех. Вы получаете крупный приз!"
        1 -> "Вы угадали всего одно число из трех. Вас ждет утешительный приз"
        else -> "Вы проиграли, попробуйте в другой раз..."
    }
    println(resultText)

    println("А вот числа для победы в лотерее: ${winFirstNum}, ${winSecondNum}, $winThirdNum")
}
