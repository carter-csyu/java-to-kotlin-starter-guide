package com.carter.lec08

fun max(a: Int, b:Int): Int {
    return if (a > b) a else b
}

fun max2(a: Int, b:Int): Int = if (a > b) a else b

fun max3(a: Int, b:Int) = if (a > b) a else b

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) println(str) else print(str)
    }
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}

fun main() {
    repeat(str = "하하하", useNewLine = false)

    println("\n-----------------------")

    repeat(useNewLine = false, str = "허허허")

    println("\n-----------------------")

    printAll("A", "B", "C")

    println("-----------------------")

    val array = arrayOf("A", "B", "C")
    printAll(*array)
}