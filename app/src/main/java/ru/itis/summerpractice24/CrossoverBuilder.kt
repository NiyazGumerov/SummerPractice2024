package ru.itis.summerpractice24

import ru.itis.summerpractice24.Universal.Trunks

class CrossoverBuilder():CarBuilder() {
    protected var enginePower: Int? = null
        private set
    protected var typeOfPrivod: Crossover.Privods? = null
        private set
    fun setEnginePower(int: Int) {
        this.enginePower = int
    }

    fun setTypeOfPrivod(type: Crossover.Privods) {
        this.typeOfPrivod = type
    }


    override fun build(): Crossover {
        return Crossover(brand = brand, model = model, year = year, maxSpeed = maxSpeed, enginePower = enginePower, typeOfPrivod = typeOfPrivod)
    }

}