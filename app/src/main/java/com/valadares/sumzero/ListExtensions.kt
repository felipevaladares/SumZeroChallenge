package com.valadares.sumzero

fun List<Int>.sumZero(): Pair<Int, Int>? {
    for (number in this) {
        firstOrNull { it + number == 0 }?.let { firstMatch ->
            return Pair(number, firstMatch)
        }
    }
    return null
}