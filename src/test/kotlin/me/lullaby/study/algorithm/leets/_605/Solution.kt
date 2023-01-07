package me.lullaby.study.algorithm.leets._605

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var remain = n
        val flowerbedLength = flowerbed.size
        if (flowerbedLength == 1) {
            if (flowerbed[0] == 0) remain--
        } else if (flowerbedLength == 2) {
            if (flowerbed[0] == 0 && flowerbed[1] == 0) remain--
        } else {
            if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                flowerbed[0] = 1
                remain--
            }
            if (flowerbed[flowerbedLength - 1] == 0 && flowerbed[flowerbedLength - 2] == 0) {
                flowerbed[flowerbedLength - 1] = 1
                remain--
            }
            for (index in 0 until flowerbed.size - 2) {
                val current = flowerbed[index]
                val next = flowerbed[index + 1]
                val nextOfNext = flowerbed[index + 2]
                if (current == 0 && next == 0 && nextOfNext == 0) {
                    flowerbed[index + 1] = 1
                    remain--
                }
            }
        }

        return remain <= 0
    }

    @Test
    fun case1() {
        assertEquals(true, Solution().canPlaceFlowers(listOf(1, 0, 0, 0, 1).toIntArray(), 1))
    }

    @Test
    fun case2() {
        assertEquals(false, Solution().canPlaceFlowers(listOf(1, 0, 0, 0, 1).toIntArray(), 2))
    }

    @Test
    fun case3() {
        assertEquals(true, Solution().canPlaceFlowers(listOf(0, 0, 1, 0, 0).toIntArray(), 1))
    }



}
