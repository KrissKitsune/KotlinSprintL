package Lesson4

const val MAX_CREW = 70
const val MIN_CREW = 55
fun main() {

    val numOfCrew: Int
    val boxesOfFood: Int
    val isTheWeatherNice: Boolean
    val permissionToCruise: Boolean

    print("Корабль поврежден? Введите true или false ")
    val isShipDamaged = readln().toBoolean()

    print("Число экипажа: ")
    numOfCrew = readln().toInt()

    print("Сколько ящиков провизии на борту? ")
    boxesOfFood = readln().toInt()

    print("Благоприятная ли погода для плавания? Введите true или false ")
    isTheWeatherNice = readln().toBoolean()

    permissionToCruise = (!isShipDamaged && (numOfCrew in MIN_CREW..MAX_CREW) && (boxesOfFood > 50)) ||
            (isShipDamaged && (numOfCrew == MAX_CREW) && (boxesOfFood >= 50) && isTheWeatherNice)
    println("Разрешение на долгосрочное плавание: $permissionToCruise")
}