package Lesson4

fun main() {
    val exercisesDay = 5

    val exercisesLegs = exercisesDay % 2 == 0
    val exercisesHands = !(exercisesDay % 2 == 0)
    val exercisesBack = exercisesDay % 2 == 0
    val exercisesBelly = !(exercisesDay % 2 == 0)
    println(
        """ 
         |День тренировок - $exercisesDay!
         |Упражнения для рук:    $exercisesHands
         |Упражнения для ног:    $exercisesLegs
         |Упражнения для спины:  $exercisesBack
         |Упражнения для пресса: $exercisesBelly""".trimMargin()
    )
}