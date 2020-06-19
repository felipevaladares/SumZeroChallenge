package com.valadares.sumzero

import org.junit.Test

import org.junit.Assert.*

/**
 * Unit tests to ensure that sumZero() extension is working properly
 */
class SumZeroTestCase {

    @Test
    fun addition_isCorrect() {

        var result = listOf<Int>().sumZero()
        assertNull(result)

        result = listOf(1,2).sumZero()
        assertNull(result)

        result = listOf(1,2,4,7).sumZero()
        assertNull(result)

        var expectedResult = Pair(-3, 3)
        result = listOf(-4, -3, -2, 1, 2, 3, 5).sumZero()
        assertEquals(expectedResult, result)

        expectedResult = Pair(-2, 2)
        result = listOf(-4, -3, -2, 1, 2, 5).sumZero()
        assertEquals(expectedResult, result)
    }
}