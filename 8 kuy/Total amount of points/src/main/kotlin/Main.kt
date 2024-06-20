package org.chelex

fun main() {
    println(points(listOf("1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3")))
}

//fun points(games: List<String>) =
//    games
//        .map { it.first().toInt() - it.last().toInt() }
//        .map { if (it > 0) 3 else if (it < 0) 0 else 1 }
//        .sum()

fun points(games: List<String>) =
    games.sumBy {
        val (x, y) = it.split(":")
        when {
            x > y -> 3
            x < y -> 0
            else -> 1
        }
    }