package Lesson5

import kotlin.system.exitProcess

fun main() {
    val winFirstNum = (0..42).random()
    val variableNum = (0..42).random()
    //дальше блок кода, чтобы генерировались разные числа, чтобы сверка коллекций была релевантной
    val winSecondNum = if (winFirstNum != variableNum) {
        variableNum
    } else (0..42).random()
    val winThirdNum = if ((winFirstNum != variableNum) && (winSecondNum != variableNum)) {
        variableNum
    } else (0..42).random()

    println("Вы участвуете в лотерее! Вам нужно ввести три разных числа в диапазоне от 0 до 42!\n Ваше первое число? ")
    val userFirstNum = readln().toInt()
    if (userFirstNum !in 0..42) {
        println("Вы ввели $userFirstNum, оно не в диапазоне от 0 до 42!")
        exitProcess(1)
    }

    println("Число принято!\n Ваше второе число? ")
    var userSecondNum = readln().toInt()
    if (userSecondNum !in 0..42) {
        println("Вы ввели ${userSecondNum}, оно не в диапазоне от 0 до 42!")
        exitProcess(1)
    } else if (userFirstNum != userSecondNum) {
        println("Число принято!")
    } else {
        println("Попробуйте еще раз...")
        userSecondNum = readln().toInt()
    }

    println("Ваше третье число? ")
    var userThirdNum = readln().toInt()
    if (userThirdNum !in 0..42) {
        println("Вы ввели ${userThirdNum}, оно не в диапазоне от 0 до 42!")
        exitProcess(1)
    } else if ((userThirdNum != userFirstNum) && (userThirdNum != userSecondNum)) {
        println("Число принято!")
    } else {
        println("Попробуйте еще раз...")
        userThirdNum = readln().toInt()
    }
    val listWinNum = listOf(winFirstNum, winSecondNum, winThirdNum)
    val listUsersNum = listOf(userFirstNum, userSecondNum, userThirdNum)

    val matchesNum = listWinNum.intersect(listUsersNum.toSet()) //сравнение списков
    //println(matchesNum) //коллекция с числами, которые совпали
    val matchesCount = matchesNum.count()
    //println(matchesCount) //проверка счетчика элементов массива с совпадениями

    val resultText = when (matchesCount) {
        3 -> "Вы выйграли и получаете ДЖЕКПОТ!"
        2 -> "Вы угадали два числа из трех. Вы получаете крупный приз!"
        1 -> "Вы угадали всего одно число из трех. Вас ждет утешительный приз"
        else -> "Вы проиграли, попробуйте в другой раз..."
    }
    println(resultText)

    println("А вот числа для победы в лотерее: ${winFirstNum}, ${winSecondNum}, $winThirdNum") //проверка рандомных чисел для выйгрыша
}
