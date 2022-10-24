package com.carter.lec16

fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun main() {
    val str = "ABC"
    println(str.lastChar())
}