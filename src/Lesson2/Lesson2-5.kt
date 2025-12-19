package Lesson2

import kotlin.math.pow

fun main() {
    val money = 70_000
    val proc = 16.7
    val years = 20

    val bigMoney = money * ((1 + proc / 100.0).pow(years))
    println(String.format("%1.3f", bigMoney))
}