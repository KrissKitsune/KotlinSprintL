package Lesson5

fun main() {
    println(
        "Приветствую, Пользователь! Собираешься в путешествие?\n" +
                "Давай рассчитаем стоимость твоего путешествия! Насколько дальнее твое путешествие? (в километрах)"
    )
    val travelDistance = readln().toDouble()
    println("Какой расход топлива у твоего автомобиля на 100км?(в литрах)")
    val fuelConsumption = readln().toDouble()
    println("Цена топлива, на данный момент в рублях РФ?")
    val fuelCost = readln().toDouble()

    val fuelForTravel = (travelDistance * fuelConsumption) / 100
    val travelCost = fuelForTravel * fuelCost

    println(
        "Для вашей поездки потребуется $fuelForTravel литров топлива," +
                "и это будет стоить: ${String.format("%1.2f", travelCost)} руб."
    )
}