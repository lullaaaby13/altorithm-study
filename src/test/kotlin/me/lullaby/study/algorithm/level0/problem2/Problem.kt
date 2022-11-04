package me.lullaby.study.algorithm.level0.problem2

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem {

    @Test
    internal fun case1() {
        Assertions.assertEquals(5, Solution().solution(listOf(1,2,3,4).toIntArray()))
    }

    @Test
    internal fun case2() {
        Assertions.assertEquals(16, Solution().solution(listOf(2,4,8).toIntArray()))
    }

}

class Solution {
    fun solution(common: IntArray): Int {
        val isArithmeticSequence = common[1] - common[0] == common[2] - common[1]
        if (isArithmeticSequence) {
            return common.last() + (common[1] - common[0])
        } else {
            return common.last() * (common[1] / common[0])
        }
    }
}
