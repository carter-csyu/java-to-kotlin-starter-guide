package com.carter.lec15

fun main() {
    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("${i}, ${array[i]}")
    }

    println("----------------")

    array.plus(300)
    for ((idx, value) in array.withIndex()) {
        println("${idx}, $value")
    }

    println("----------------")

    val numbers = listOf<Int>(100, 200)
    val emptyList = emptyList<Int>() // 타입 추론이 불가능하기 때문에 타입을 명시해주어야 한다.
    printNumbers(emptyList()) // 타입을 추론할 수 있다면 생략 가능하다.

    println("----------------")

    println(numbers[0])

    println("----------------")

    for (number in numbers) {
        println(number)
    }

    println("----------------")

    for ((idx, number) in numbers.withIndex()) {
        println("$idx, $number")
    }

    // 가변(Mutable) 리스트
    val mutableNumbers = mutableListOf(100, 200)
    mutableNumbers.add(300)

    println("----------------")

    val numberSet = setOf(100, 200)
    val mutableNumberSet = mutableSetOf(100, 200)
    mutableNumberSet.add(300)

    println("----------------")
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")
    mapOf(Pair(1, "MONDAY"), Pair(2, "TUESDAY"))

    for (key in oldMap.keys) {
        println("${key}, ${oldMap[key]}")
    }

    for ((key, value) in oldMap.entries) {
        println("${key}, ${value}")
    }

    println("----------------")


}

private fun printNumbers(numbers: List<Int>) {
}