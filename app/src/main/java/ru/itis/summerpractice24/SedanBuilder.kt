package ru.itis.summerpractice24

import ru.itis.summerpractice24.Truck.Trailers

class SedanBuilder():CarBuilder() {
    protected var trailerVolume: Int? = null
        private set
    protected var typeOfTrailer: Truck.Trailers? = null
        private set
    fun setTrailerVolume(int: Int) {
        this.trailerVolume = int
    }

    fun setTypeOfTrailer(type: Truck.Trailers) {
        this.typeOfTrailer = type
    }


    override fun build(): Truck {
        return Truck(brand = brand, model = model, year = year, maxSpeed = maxSpeed, trailerVolume = trailerVolume, typeOfTrailer = typeOfTrailer)
    }
}