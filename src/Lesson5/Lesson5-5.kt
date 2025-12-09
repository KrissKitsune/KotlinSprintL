package Lesson5

import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    val winFirstNum = (Random.Default).nextInt(43)
    var variableNum = (Random.Default).nextInt(43)
    //дальше блок кода, чтобы генерировались разные числа, чтобы сверка коллекций была релевантной
    val winSecondNum = if (winFirstNum != variableNum) {
        variableNum
    } else (Random.Default).nextInt(43)
    val winThirdNum = if ((winFirstNum != variableNum) && (winSecondNum != variableNum)) {
        variableNum
    } else (Random.Default).nextInt(43)

    val userFirstNum: Int
    var userSecondNum: Int
    var userThirdNum: Int
    println("Вы участвуете в лотерее! Вам нужно ввести три разных числа в диапазоне от 0 до 42!\n Ваше первое число? ")
    userFirstNum = readln().toInt()
    if (!(userFirstNum in 0..42)) {
        println("Вы ввели $userFirstNum, оно не в диапазоне от 0 до 42!")
        exitProcess(1)
    }

    println("Число принято!\n Ваше второе число? ")
    userSecondNum = readln().toInt()
    if (!(userSecondNum in 0..42)) {
        println("Вы ввели ${userSecondNum}, оно не в диапазоне от 0 до 42!")
        exitProcess(1)
    } else if (userFirstNum != userSecondNum) {
        println("Число принято!")
    } else {
        println("Попробуйте еще раз...")
        userSecondNum = readln().toInt()
    }

    println("Ваше третье число? ")
    userThirdNum = readln().toInt()
    if (!(userThirdNum in 0..42)) {
        println("Вы ввели ${userThirdNum}, оно не в диапазоне от 0 до 42!")
        exitProcess(1)
    } else if ((userThirdNum != userFirstNum) && (userThirdNum != userSecondNum)) {
        println("Число принято!")
    } else {
        println("Попробуйте еще раз...")
        userThirdNum = readln().toInt()
    }
    val listWinNums = listOf(winFirstNum, winSecondNum, winThirdNum) //сравнение списков

    val listUsersNum = listOf(userFirstNum, userSecondNum, userThirdNum)
    val matchesNum = listWinNums.intersect(listUsersNum)
    //println(matchesNum) //коллекция с числами, которые совпали
    val matchesCount = matchesNum.count()
    // println(matchesCount) //проверка счетчика элементов массива с совпадениями

    val resultText = when (matchesCount) {
        3 -> "Вы выйграли и получаете ДЖЕКПОТ!"
        2 -> "Вы угадали два числа из трех. Вы получаете крупный приз!"
        1 -> "Вы угадали всего одно число из трех. Вас ждет утешительный при1з"
        else -> "Вы проиграли, попробуйте в другой раз..."
    }
    println(resultText)

    println("А вот числа для победы в лотерее: ${winFirstNum}, ${winSecondNum}, ${winThirdNum}") //проверка рандомных чисел для выйгрыша
}
