package Lesson2

const val PROCENT = 100

fun main() {
    val iron = 11.0
    val crystal = 7.0
    val buff = 20
    println("До действия бафа добыто $iron железа и $crystal кристаллов. Бафф составлет $buff%.")

    val ironBonus = ((iron / PROCENT) * buff).toInt()
    val crystalBonus = ((crystal / PROCENT) * buff).toInt()
    println("С баффом вы получите сверху этого:\n$ironBonus железа,\n$crystalBonus кристаллов")
}