package me.lullaby.study.algorithm.level1.problem1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Solution {

    fun solution(food: IntArray): String {

        val stringBuilder = StringBuilder()

        for (index in 1 until food.size) {
            if (food[index] % 2 == 0) {
                for (count in 1 .. food[index] / 2) stringBuilder.append(index)
            } else {
                for (count in 1 .. (food[index] - 1) / 2) stringBuilder.append(index)
            }
        }

        val before = stringBuilder.toString()
        val after = stringBuilder.reverse().toString()

        return "${before}0${after}"
    }

    @Test
    internal fun case1() {
        Assertions.assertEquals("1223330333221", Solution().solution(listOf(1, 3, 4, 6).toIntArray()))
    }

    @Test
    internal fun case2() {
        Assertions.assertEquals("111303111", Solution().solution(listOf(1, 7, 1, 2).toIntArray()))
    }

    @Test
    internal fun case3() {
        Assertions.assertEquals("202", Solution().solution(listOf(1, 1, 2).toIntArray()))
    }

}
