package com.carter.lec01

fun main() {
    var number1:Long = 10L
    number1 = 5L

    val number2 = 10L
    // number2 = 5L // Val cannot be reassigned

    // var number3 // This variable must either have a type annotation or be initialize
    var number1_1: Long
    number1_1 = 5L

    val number2_1: Long
    number2_1 = 5L

    // var number3: Long = null // Null can not be a value of a non-null type Long
    var number3: Long? = null

    var person = Person("유춘상")
}