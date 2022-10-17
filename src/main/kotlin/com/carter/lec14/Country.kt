package com.carter.lec14

enum class Country(
    private val code: String,
) {
    KOREA("KO"),
    JAPAN("JA"),
    ;
}

fun main() {
    println(Country.KOREA.name)
    println("--------------------")
}

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.JAPAN -> TODO()
    }
}