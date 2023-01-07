package me.lullaby.study.algorithm.leets._2125

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Solution {
    fun numberOfBeams(bank: Array<String>): Int {

        val validRows = bank.filter { !isEmptyRow(it) }

        if (validRows.size < 2) {
            return 0
        }

        var sum = 0

        for (index in 0 until validRows.size - 1) {
            val curr = validRows[index]
            val next = validRows[index + 1]
            sum += curr.count { it == '1' } * next.count { it == '1'}
        }

        return sum
    }

    private fun isEmptyRow(source: String): Boolean {
        return source.all { it == '0' }
    }

    @Test
    fun assertIsEmptyRow() {
        assertEquals(true, isEmptyRow("0000000"))
        assertEquals(false, isEmptyRow("0000001"))
    }

    @Test
    fun case1() {
        assertEquals(8, Solution().numberOfBeams(arrayOf("011001","000000","010100","001000")))
    }
    @Test
    fun case2() {
        assertEquals(0, Solution().numberOfBeams(arrayOf("000","111","000")))
    }

}
