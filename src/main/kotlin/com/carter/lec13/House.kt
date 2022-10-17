package com.carter.lec13


class House(
    private val address: String,
) {
    private val livingRoom: LivingRoom = this.LivingRoom(10.0)

    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@House.address
    }
}