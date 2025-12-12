package Lesson3
fun main() {
    val chess = "D2-D4;0"
    val step = chess.substring(6)
    val from = chess.substring(0, 2)
    val to = chess.substring(3, 5)

    println(
        """
        |Откуда - $from
        |Куда - $to
        |Номер хода - $step
    """.trimMargin()
    )
}