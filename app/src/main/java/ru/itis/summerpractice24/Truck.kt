package ru.itis.summerpractice24

class Truck(
    brand: String? = null,
    model: String? = null,
    year: Int? = null,
    maxSpeed: Int? = null,
    protected var trailerVolume: Int? = null,
    protected var typeOfTrailer: Trailers? = null
) : Car(brand, model, year, maxSpeed) {
    enum class Trailers(val value: String) {
        Body("Кузов"), Trailer("Прицеп")
    }

    override fun printer() {
        println("Марка: $brand")
        println("Модель: $model")
        println("Год выпуска: $year")
        println("Максимальная скорость: $maxSpeed км/ч")
        println("Объем отсека для груза: $trailerVolume литров")
        println("Тип отсека для груза: ${typeOfTrailer?.value} ")

    }
}

fun main() {
    var truckk = Truck("subaru", "soSpoilerom", 2001, 508, 1002, Truck.Trailers.Trailer)
    truckk.printer()
}