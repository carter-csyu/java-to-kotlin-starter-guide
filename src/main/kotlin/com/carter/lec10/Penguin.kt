package com.carter.lec10

class Penguin(
    species: String,
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override val legCount: Int
        get() = this.wingCount + super.legCount

    override fun move() {
        println("팽귄이 움직입니다~")
    }

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = super.swimAbility
}