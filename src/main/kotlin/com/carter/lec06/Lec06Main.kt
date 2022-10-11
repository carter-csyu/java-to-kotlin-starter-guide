package com.carter.lec06

fun main() {

    val numbers = listOf(1L, 2L, 3L)
    // : 대신 in 을 사용한다
    for (number in numbers) {
        println(number)
    }

    println("---------------")

    for (i in 1..3) {
        println(i)
    }

    println("---------------")

    for (i in 3 downTo 1) {
        println(i)
    }

    println("---------------")

    for (i in 1..5 step 2) {
        println(i)
    }

    println("---------------")

    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }
}