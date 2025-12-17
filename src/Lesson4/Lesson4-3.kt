package Lesson4

const val SUNNY_CONDITIONS_FOR_LEGUMES = true
const val TENT_IS_OPENED_FOR_LEGUMES = true
const val AIR_HUMIDITY_FOR_LEGUMES = 20
const val SEASON_FOR_LEGUMES = "весна,лето,осень"

fun main() {
    val sunnyToday = true
    val tentIsOpened = true
    val airHumidityToday = 20
    val seasonToday = "зима"
    val listOfNeedSeasonForLegumes = SEASON_FOR_LEGUMES.split(",")

    val suitableConditions =
        (sunnyToday == SUNNY_CONDITIONS_FOR_LEGUMES) && (tentIsOpened == TENT_IS_OPENED_FOR_LEGUMES)
                && (airHumidityToday == AIR_HUMIDITY_FOR_LEGUMES) && (listOfNeedSeasonForLegumes.contains(seasonToday))

    println("Благоприятные ли условия сейчас для роста бобовых? $suitableConditions")
}