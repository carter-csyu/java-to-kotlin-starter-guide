package com.carter.lec16

fun main() {
    3.add1(4)
    3.add2(4)
    3 add2 4
}

fun Int.add1(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

inline fun Int.add3(other: Int): Int {
    return this + other
}
