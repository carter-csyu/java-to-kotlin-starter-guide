package com.carter.lec12


class Person private constructor(
    val name: String,
    val age: Int
) {
    companion object Factory : Log {
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name:String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행 객체(companion object) Factory 입니다.")
        }
    }
}

object Singleton {
    var a: Int = 0
}

fun main() {
    println(Singleton.a)
    Singleton.a = 1
    println(Singleton.a)

    println("--------------")

    moveSomething(object : Movable {
        override fun move() {
            println("move move")
        }

        override fun fly() {
            println("fly fly")
        }
    })
}

private fun moveSomething(moveable: Movable) {
    moveable.move()
    moveable.fly()
}
