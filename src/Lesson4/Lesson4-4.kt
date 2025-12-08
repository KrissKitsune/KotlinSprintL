package Lesson4

fun main() {
    val exercisesDay = 5
    val isDayEven = exercisesDay % 2 == 0

    val exercisesLegs = isDayEven
    val exercisesHands = !isDayEven
    val exercisesBack = isDayEven
    val exercisesBelly = !isDayEven

    println(
        """ 
         |День тренировок - $exercisesDay!
         |Упражнения для рук:    $exercisesHands
         |Упражнения для ног:    $exercisesLegs
         |Упражнения для спины:  $exercisesBack
         |Упражнения для пресса: $exercisesBelly""".trimMargin()
    )
}