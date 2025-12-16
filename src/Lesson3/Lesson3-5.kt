package Lesson3

fun main() {

    val chess = "D2-D4;0"

    val turnOfPlayer = chess.split("-", ";")
    val step = turnOfPlayer[2]
    val from = turnOfPlayer[0]
    val to = turnOfPlayer[1]

    println(
        """
        |Откуда - $from
        |Куда - $to
        |Номер хода - $step
    """.trimMargin()
    )
}