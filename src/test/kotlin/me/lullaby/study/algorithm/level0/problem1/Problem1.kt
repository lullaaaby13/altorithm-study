package me.lullaby.study.algorithm.level0.problem1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem1 {

    @Test
    internal fun case1() {
        val babbling = listOf("aya", "yee", "u", "maa", "wyeoo")
        Assertions.assertEquals(1, Solution().solution(babbling.toTypedArray()))

    }

    @Test
    internal fun case2() {
        val babbling = listOf("ayaye", "uuuma", "ye", "yemawoo", "ayaa")
        Assertions.assertEquals(3, Solution().solution(babbling.toTypedArray()))
    }

    @Test
    internal fun name() {

        println("banana".replaceFirst("na", ""))
    }
}

class Solution {
    fun solution(babbling: Array<String>): Int {
        var count: Int = 0

        babbling.forEach {
            if (
                it.replaceFirst("aya", " ")
                    .replaceFirst("ye", " ")
                    .replaceFirst("woo", " ")
                    .replaceFirst("ma", " ")
                    .isBlank()
            ) {
                count++
            }
        }

        return count
    }
}

// wyeoo 예외 케이스




val _1 = "aya"
val _2 = "ye"
val _3 = "woo"
val _4 = "ma"

val possible = listOf(
    _1, _2, _3, _4,

    "$_1$_2", "$_1$_3", "$_1$_4",
    "$_2$_1", "$_2$_3", "$_2$_4",
    "$_3$_1", "$_3$_2", "$_3$_4",
    "$_4$_1", "$_4$_2", "$_4$_3",

    "$_1$_2$_3", "$_1$_3$_2",
    "$_1$_2$_4", "$_1$_4$_2",
    "$_1$_3$_4", "$_1$_4$_3",

    "$_2$_1$_3", "$_2$_3$_1",
    "$_2$_1$_4", "$_2$_4$_1",
    "$_2$_3$_4", "$_2$_4$_3",

    "$_3$_1$_2", "$_3$_2$_1",
    "$_3$_1$_4", "$_3$_4$_1",
    "$_3$_2$_4", "$_3$_4$_2",

    "$_4$_1$_2", "$_4$_2$_1",
    "$_4$_1$_3", "$_4$_3$_1",
    "$_4$_2$_3", "$_4$_3$_2",

    "$_1$_2$_3$_4",
    "$_2$_3$_4$_1",
    "$_3$_4$_1$_2",
    "$_4$_1$_2$_3",
)