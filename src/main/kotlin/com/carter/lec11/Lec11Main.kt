package com.carter.lec11

public val a = 3

public fun add(a: Int, b: Int): Int = a + b

open class Cat protected constructor()

class Car(
    internal val name: String,
    private val owner: String,
    _price: Int
) {
    var price = _price
        private set
}