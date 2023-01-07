package me.lullaby.study.algorithm.level1.problem2

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Solution {
    fun solution(s: String): IntArray {
        val answer = mutableListOf<Int>()

        val lastIndexMap = hashMapOf<Char, Int>()


        (s.indices).forEach { index ->

            val currChar = s[index]

            if (lastIndexMap.containsKey(currChar)) {
                val lastIndex = lastIndexMap.get(currChar)
                answer.add(index - lastIndex!!)
            } else {
                answer.add(-1)
            }
            lastIndexMap.put(currChar, index)
        }


        return answer.toIntArray()
    }

    @Test
    internal fun case1() {
        assertArrayEquals(intArrayOf(-1, -1, -1, 2, 2, 2), Solution().solution("banana"))
    }

    @Test
    internal fun case2() {
        assertArrayEquals(intArrayOf(-1, -1, 1, -1, -1, -1), Solution().solution("foobar"))
    }

}
