package ru.itis.summerpractice24

import ru.itis.summerpractice24.Universal.Trunks

class UniversalBuilder():CarBuilder() {
    protected var trunkVolume: Int? = null
        private set
    protected var typeOfTrunk: Universal.Trunks? = null
        private set
    fun setTrunkVolume(int: Int) {
        this.trunkVolume = int
    }

    fun setTypeOfTrunk(type: Universal.Trunks) {
        this.typeOfTrunk = type
    }


    override fun build(): Universal {
        return Universal(brand = brand, model = model, year = year, maxSpeed = maxSpeed, trunkVolume = trunkVolume, typeOfTrunk = typeOfTrunk)
    }

}