package ru.itis.summerpractice24

import kotlin.math.max

class Crossover(
    brand: String? = null,
    model: String? = null,
    year: Int? = null,
    maxSpeed: Int? = null,
    protected var enginePower: Int? = null,
    protected var typeOfPrivod: Privods? = null
) : Car(brand, model, year, maxSpeed) {
    enum class Privods(val value: String) {
        Front("Передний"), Rear("Задний"), Full("Полный")
    }

    override fun printer() {
        println("Марка: $brand")
        println("Модель: $model")
        println("Год выпуска: $year")
        println("Максимальная скорость: $maxSpeed км/ч")
        println("Мощность двигателя: $enginePower лошадиных сил")
        println("Тип привода: ${typeOfPrivod?.value} ")

    }
}

fun main() {
    var crossoverr = Crossover("subaru", "soSpoilerom", 2001, 508, 1002, Crossover.Privods.Front)
    crossoverr.printer()
}