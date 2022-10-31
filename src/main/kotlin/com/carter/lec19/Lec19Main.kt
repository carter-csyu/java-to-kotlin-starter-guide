package com.carter.lec19

import com.carter.lec17.Fruit
import com.carter.lec19.a.printHelloWorld as printHelloWorldA
import com.carter.lec19.b.printHelloWorld as printHelloWorldB

typealias FruitFilter = (Fruit) -> Boolean

private fun filterFruits(fruits: List<Fruit>, filter: FruitFilter): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }

    return results
}

data class Person(
    val name: String,
    val age: Int,
)

class Person2(
    val name: String,
    val age: Int
) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}

data class Number(
    val number: Int
) {

    fun getNumberOrNull(): Int? {
        return if (number <= 0) {
            null
        } else {
            number
        }
    }

    fun getNumberOrNullV2(): Int? {
        return number.takeIf { it > 0 }
    }

    fun getNumberOrNullV3(): Int? {
        return number.takeUnless { it <= 0 }
    }
}

fun main() {

    // Type Alias, as import
    printHelloWorldA()
    printHelloWorldB()

    // 구조분해와 componentN 함수
    val person = Person("유춘상", 33)
    val (name, age) = person // person.component1(), person.component2()
    println("이름: ${name}, 나이: ${age}")

    val person2 = Person2("유춘상", 33)
    val (name2, age2) = person2 // person.component1(), person.component2()
    println("이름: ${name2}, 나이: ${age2}")

    val numbers = listOf(1, 2, 3)
    numbers.map { number -> number + 1 }
        .forEach { number -> println(number) }

    for (number in numbers) {
        if (number == 2) {
            break
        }
    }

    // break
    run {
        numbers.forEach { number ->
            if (number == 2) {
                return@run
            }
        }
    }

    // continue
    numbers.forEach { number ->
        if (number == 2) {
            return@forEach
        }
    }

    // jump (using label)
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@loop
            }
            print("${i} ${j}")
        }
    }


}
