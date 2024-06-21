package org.chelex

import java.util.function.Consumer

fun main() {
    println(/*listOf(4, 6, 8) == */evenNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 3))
    println(/*listOf(-8, 26) == */evenNumbers(listOf(-22, 5, 3, 11, 26, -6, -7, -8, -9, -8, 26), 2))
    println(/*listOf(6) ==*/ evenNumbers(listOf(6, -25, 3, 7, 5, 5, 7, -3, 23), 1))
}

// Just because the challenge says "array" does not mean we should use a Kotlin Array...
fun evenNumbers(array: List<Int>, number: Int): List<Int> {
    var resultList: List<Int> = ArrayList(number)

    array.reversed().forEach(Consumer {
        if (resultList.size == number) return@Consumer else if (it % 2 == 0) resultList += it
    })
    return resultList.reversed()
}