package ru.itis.summerpractice24

import kotlin.math.max


open class Car(
    var brand: String? = null,
    protected var model: String? = null,
    protected var year: Int? = null,
    protected var maxSpeed: Int? = null
) : Comparable<Car> {


    open fun printer() {
        println("Марка: $brand")
        println("Модель: $model")
        println("Год выпуска: $year")
        println("Максимальная скорость: $maxSpeed км/ч")
    }

    override fun compareTo(car2: Car): Int {
        if ((this.maxSpeed ?: 0) > (car2.maxSpeed ?: 0)) {
            return 1;
        } else if ((this.maxSpeed ?: 0) < (car2.maxSpeed ?: 0)) {
            return -1;
        } else {
            return 0;
        }
    }

}

fun main() {
    val car1 = Car("subaru", "soSpoilerom", 2001, 508)
    car1.printer()
}

