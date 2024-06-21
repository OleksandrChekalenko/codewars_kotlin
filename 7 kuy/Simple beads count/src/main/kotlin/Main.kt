package org.chelex

fun main() {
    println(0 == countRedBeads(0))
    println(0 == countRedBeads(1))
    println(4 == countRedBeads(3))
    println(8 == countRedBeads(5))
}

fun countRedBeads(nBlue: Int) = if (nBlue < 2) 0 else (nBlue * 2) - 2