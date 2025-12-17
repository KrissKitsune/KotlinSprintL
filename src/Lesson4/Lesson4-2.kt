package Lesson4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {
    var cargoWeight: Int
    var cargoVolume: Int
    var averageResult: Boolean

    cargoWeight = 20
    cargoVolume = 80
    averageResult = (MIN_WEIGHT < cargoWeight) && (cargoWeight <= MAX_WEIGHT) && (cargoVolume < MAX_VOLUME)
    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': $averageResult")

    cargoWeight = 50
    cargoVolume = 100
    averageResult = (MIN_WEIGHT < cargoWeight) && (cargoWeight <= MAX_WEIGHT) && (cargoVolume < MAX_VOLUME)
    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': $averageResult")

}