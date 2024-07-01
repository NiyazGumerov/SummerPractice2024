package ru.itis.summerpractice24

class Universal(
    brand: String? = null,
    model: String? = null,
    year: Int? = null,
    maxSpeed: Int? = null,
    protected var trunkVolume: Int? = null,
    protected var typeOfTrunk: Trunks? = null
) : Car(brand, model, year, maxSpeed) {
    enum class Trunks(val value: String) {
        Door("Дверевой"), Rear("Открывающийся наверх")
    }

    override fun printer() {
        println("Марка: $brand")
        println("Модель: $model")
        println("Год выпуска: $year")
        println("Максимальная скорость: $maxSpeed км/ч")
        println("Объем багажника: $trunkVolume литров")
        println("Тип багажника: ${typeOfTrunk?.value} ")

    }
}

fun main() {
    var universall = Universal("subaru", "soSpoilerom", 2001, 508, 1002, Universal.Trunks.Door)
    universall.printer()
}