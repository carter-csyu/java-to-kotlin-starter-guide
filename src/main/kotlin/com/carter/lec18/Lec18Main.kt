package com.carter.lec18


fun main() {
    val fruits = listOf(
        Fruit(1, "사과", 1_000, 1_500),
        Fruit(2, "사과", 1_200, 1_700),
        Fruit(3, "사과", 1_200, 1_700),
        Fruit(4, "사과", 1_500, 2_000),
        Fruit(5, "바나나", 3_000, 3_500),
        Fruit(6, "바나나", 3_200, 3_700),
        Fruit(7, "바나나", 2_500, 3_000),
        Fruit(8, "수박", 10_000, 17_000),
    )

    val apples = fruits.filter { fruit -> fruit.name == "사과" }
    val apples2 = fruits.filterIndexed { idx, fruit ->
        println("${idx}")
        fruit.name == "사과"
    }
    val applePrices = fruits
        .filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.currentPrice }
    val applePrices2 = fruits
        .filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruit ->
            println("$idx")
            fruit.currentPrice
        }

    // Mapping의 결과가 null이 아닌 것만 가져오고 싶을 때?
//    val values = fruits.filter { fruit -> fruit.name == "사과" }
//        .mapNotNull { fruit: Fruit -> fruit.nullOrValue() }

    val isAllApple = fruits.all { fruit -> fruit.name == "사과" }
    val isNoApple = fruits.none { fruit -> fruit.name == "사과" }
    val isAnyApple = fruits.any { fruit -> fruit.factoryPrice >= 10_000 }
    val fruitCount = fruits.count()
    val sortedFruits = fruits.sortedBy { fruit -> fruit.currentPrice }
    val sortedFruits2 = fruits.sortedByDescending { fruit -> fruit.currentPrice }
    val distictFruitNames = fruits
        .distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }
    val firstFruit = fruits.first()
    val firstFruit2 = fruits.firstOrNull()
    val lastFruit = fruits.last()
    val lastFruit2 = fruits.lastOrNull()

    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
    val fruitNameMap: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }

    val nameFactoryPricesMap: Map<String, List<Long>> = fruits.groupBy({ fruit -> fruit.name }, { fruit -> fruit.factoryPrice })
    val idFactoryPricemap: Map<Long, Long> = fruits.associateBy({ fruit -> fruit.id }, { fruit -> fruit.factoryPrice })

    val nestedFruits: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1, "사과", 1_000, 1_500),
            Fruit(2, "사과", 1_200, 1_700),
            Fruit(3, "사과", 1_200, 1_700),
            Fruit(4, "사과", 1_500, 2_000),
        ),
        listOf(
            Fruit(5, "바나나", 3_000, 3_500),
            Fruit(6, "바나나", 3_200, 3_700),
        ),
        listOf(
            Fruit(7, "바나나", 2_500, 3_000),
        ),
        listOf(
            Fruit(8, "수박", 10_000, 17_000),
        )
    )

    val samePriceFruits = nestedFruits.flatMap { list ->
        list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice }
    }

    val samePriceFruits2 = nestedFruits.flatMap { list -> list.samePriceFilter }

    val flattenFruits: List<Fruit> = nestedFruits.flatten()
}

val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter(Fruit::isSamePrice)

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}
