package Lesson4

const val ALL_TABLES = 13
fun main() {
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9
    println("[Доступность столиков на сегодня: ${reservedTablesToday < ALL_TABLES}]\n"
            +"[Доступность столиков на завтра: ${reservedTablesTomorrow < ALL_TABLES}]\n")
}
