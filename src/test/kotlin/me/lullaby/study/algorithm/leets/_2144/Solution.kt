package me.lullaby.study.algorithm.leets._2144

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Solution {
    fun minimumCost(cost: IntArray): Int {
        var sum = 0
        cost.toList()
            .sorted().reversed()
            .chunked(3)
            .forEach {
                if (it.size >= 1) sum += it[0]
                if (it.size >= 2) sum += it[1]
            }
        return sum
    }

    @Test
    fun case1() {
        assertEquals(5, Solution().minimumCost(listOf(3, 2, 1).toIntArray()))
    }

    @Test
    fun case2() {
        assertEquals(23, Solution().minimumCost(listOf(6,5,7,9,2,2).toIntArray()))
    }

    @Test
    fun case3() {
        assertEquals(10, Solution().minimumCost(listOf(5, 5).toIntArray()))
    }
}
