package ru.itis.summerpractice24

import ru.itis.summerpractice24.Sedan.Roofs

class TruckBuilder():CarBuilder() {
    protected var acceleration: Int? = null
        private set
    protected var typeOfRoof: Sedan.Roofs? = null
        private set
    fun setAcceleration(int: Int) {
        this.acceleration = int
    }

    fun setTypeOfRoof(type: Sedan.Roofs) {
        this.typeOfRoof = type
    }


    override fun build(): Sedan {
        return Sedan(brand = brand, model = model, year = year, maxSpeed = maxSpeed, acceleration = acceleration, typeOfRoof = typeOfRoof)
    }
}