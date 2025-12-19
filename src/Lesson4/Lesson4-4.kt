package Lesson4

fun main() {
    val exercisesDay = 5
    val isDayEven = exercisesDay % 2 == 0
    println(
        """ 
         |День тренировок - $exercisesDay!
         |Упражнения для рук:    $isDayEven
         |Упражнения для ног:    ${!isDayEven}
         |Упражнения для спины:  $isDayEven
         |Упражнения для пресса: ${!isDayEven}""".trimMargin()
    )
}