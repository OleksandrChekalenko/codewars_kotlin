package org.chelex

fun main() {
    println(filterList(listOf(1, 2, 'a', 'b')))
    println(filterList(listOf(1, 'a', 'b', 0, 15)))
    println(filterList(listOf(1, 2, "aasf", '1', "123", 123)))
}

fun filterList(l: List<Any>) = l.filter { it is Int }