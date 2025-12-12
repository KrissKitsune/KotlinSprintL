package Lesson2
import kotlin.math.pow
fun main(){
    val money = 70_000
    val proc = (16.7)/100.0
    val years = 20

    val bigMoney = money*((1+proc).pow(years))
    println(String.format("%6.3f", bigMoney))
}