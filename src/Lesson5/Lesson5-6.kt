package Lesson5

import kotlin.math.pow

const val SENTIMETRES_PER_METRES = 100

fun main() {
    println(
        "Приветствую! Это приложение поможет определить Ваш ИМТ(Индекс массы тела)\n Для этого нужны данные.\n" +
                "Ваш рост в сантиметрах: "
    )
    val heightUser = readln().toFloat()
    println("Ваш вес в киллограммах: ")
    val weightUser = readln().toFloat()

    val bodyMassIndex = weightUser / (heightUser / SENTIMETRES_PER_METRES).pow(2)
    print("Ваш ИМТ: ${String.format("%1.2f", bodyMassIndex)}. У вас: ")

    when {
        (bodyMassIndex < 18.5) -> println("Недостаточная масса тела")
        (bodyMassIndex < 25) -> println("Нормальная масса тела")
        (bodyMassIndex < 30) -> println("Избыточная масса тела")
        else -> println("Ожирение")
    }
}