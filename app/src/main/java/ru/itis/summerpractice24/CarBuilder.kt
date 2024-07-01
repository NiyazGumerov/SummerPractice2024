package ru.itis.summerpractice24

import kotlin.random.Random


open class CarBuilder() {
    protected var brand: String? = null
        private set
    protected var model: String? = null
        private set
    protected var year: Int? = null
        private set
    protected var maxSpeed: Int? = null
        private set
    fun setBrand(str: String) {
        this.brand = str
    }

    fun setModel(str: String) {
        this.model = str
    }

    fun setYear(int: Int) {
        this.year = int
    }

    fun setMaxSpeed(int: Int) {
        this.maxSpeed = int
    }

    open fun build(): Car {
        return Car(brand = brand, model = model, year = year, maxSpeed = maxSpeed)
    }
    fun randomCarGenerate(): Car{
        val carBrands = listOf(
            "Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Mercedes-Benz", "Audi", "Volkswagen", "Hyundai", "Kia"
        )
        setBrand(carBrands.random());
        val alphabet: List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')
        setModel(List(4) { alphabet.random() }.joinToString(""))
        setYear(Random.nextInt(1900,2025))
        setMaxSpeed(Random.nextInt(1000))
        return build()
    }

}