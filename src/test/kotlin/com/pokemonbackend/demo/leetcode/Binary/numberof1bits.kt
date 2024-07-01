package com.pokemonbackend.demo.leetcode.Binary

class Solution {
    fun hammingWeight(n: Int): Int {
        var count = 0
        var number = n

        while (number != 0) {
            count += number and 1
            number = number ushr 1
        }

        return count
    }
}