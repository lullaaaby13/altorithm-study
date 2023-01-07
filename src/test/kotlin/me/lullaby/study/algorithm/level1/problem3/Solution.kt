package me.lullaby.study.algorithm.level1.problem3

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Solution {

    fun solution(target: String, compare: String): Int {
        var answer: Int = 0
        val substringLength = compare.length
        val compareValue = compare.toLong()
        for (index in 0 .. target.length - substringLength) {
            if (target.substring(index, index + substringLength).toLong() <= compareValue) {
                answer++
            }
        }
        return answer
    }

    @Test
    internal fun case1() {
        assertEquals(2, Solution().solution("3141592", "271"))
    }
    @Test
    internal fun case2() {
        assertEquals(8, Solution().solution("500220839878", "7"))
    }

    @Test
    internal fun case3() {
        assertEquals(3, Solution().solution("10203", "15"))
    }
    @Test
    internal fun case4() {
        assertEquals(1, Solution().solution("123", "124"))
    }

    @Test
    internal fun case5() {
        assertEquals(0, Solution().solution("6", "5"))
        assertEquals(1, Solution().solution("4", "5"))
        assertEquals(0, Solution().solution("13", "12"))
        assertEquals(1, Solution().solution("11", "12"))
        assertEquals(2, Solution().solution("11", "9"))
    }

}
