package Lesson2

fun main(){
    val iron = 11.0
    val crystal = 7.0
    val buff = 20
    println("До действия бафа добыто $iron железа и $crystal кристаллов. Бафф составлет $buff%.")

    val ironBonus = ((iron/100)*buff).toInt()
    val crystalBonus = ((crystal/100)*buff).toInt()
    println("С баффом вы получите сверху этого:\n$ironBonus железа,\n$crystalBonus кристаллов")
}