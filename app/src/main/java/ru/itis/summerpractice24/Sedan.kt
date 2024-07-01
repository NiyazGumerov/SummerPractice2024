package ru.itis.summerpractice24


class Sedan(
    brand: String? = null,
    model: String? = null,
    year: Int? = null,
    maxSpeed: Int? = null,
    protected var acceleration: Int? = null,
    protected var typeOfRoof: Roofs? = null
) : Car(brand, model, year, maxSpeed) {
    enum class Roofs(val value: String) {
        Folding("Откидная"), NonFolding("Не откидная")
    }

    override fun printer() {
        println("Марка: $brand")
        println("Модель: $model")
        println("Год выпуска: $year")
        println("Максимальная скорость: $maxSpeed км/ч")
        println("Разгон до 100км/ч: $acceleration секунд")
        println("Тип крыши: ${typeOfRoof?.value} ")

    }
}

fun main() {
    var sedann = Sedan("subaru", "soSpoilerom", 2001, 508, 5, Sedan.Roofs.Folding)
    sedann.printer()
}