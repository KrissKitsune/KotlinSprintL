package Lesson2

fun main(){
    val hour = 9
    val minute = 39
    val timetravel = 457
    println("Время отбытия - $hour : $minute")

    val timeLive = hour * 60 + minute
    val timearrive =timeLive+timetravel
    val arrivehour = timearrive/60
    val arriveminute = timearrive%60
    val time = String.format("%02d:%02d", arrivehour,arriveminute)
    println("Время прибытия - $time")
}