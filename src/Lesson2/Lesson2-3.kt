package Lesson2
const val MULTIPLICITY_OF_TIME = 60
fun main(){
    val hour = 9
    val minute = 39
    val timeTravel = 457
    println("Время отбытия - ${String.format("%02d:%02d",hour,minute)}")

    val timeLive = (hour * MULTIPLICITY_OF_TIME) + minute
    val timeArrive =timeLive + timeTravel
    val arriveHour = timeArrive / MULTIPLICITY_OF_TIME
    val arriveMinute = timeArrive % MULTIPLICITY_OF_TIME
    println("Время прибытия - ${String.format("%02d:%02d", arriveHour,arriveMinute)}")
}