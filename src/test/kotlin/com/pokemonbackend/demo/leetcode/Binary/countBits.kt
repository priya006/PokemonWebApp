package com.pokemonbackend.demo.leetcode.Binary


class countBits {
    fun countBits(n: Int): IntArray {
        val result = IntArray(n + 1)
        for (i in 1..n) {
            result[i] = result[i shr 1] + (i and 1)
        }
        return result
    }
}


//Hint: