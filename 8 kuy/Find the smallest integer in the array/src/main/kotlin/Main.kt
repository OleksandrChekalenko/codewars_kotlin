package org.chelex

fun main() {
    println(findSmallestInt(listOf(15, 20, 10, 17, 22, 9001)))
}

fun findSmallestInt(nums: List<Int>) = nums.min()