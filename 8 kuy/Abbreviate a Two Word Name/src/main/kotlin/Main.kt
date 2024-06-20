package org.chelex

fun main() {
    println(abbrevName("Sam Harris"))
}

fun abbrevName(name: String) = name.split(" ")
    .map { it.first().uppercase() }
    .joinToString(".")
