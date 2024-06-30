package com.pokemonbackend.demo.leetcode.Binary

class Sumoftwointegers {
    fun getSum(a: Int, b: Int): Int {

        var sum = a
        var carry = b

        while(carry != 0){
            val temp = (sum and carry) shl 1
            sum = sum xor carry
            carry = temp
        }
        return sum
    }
}

//Hint: I dont have satisfaction in this problem
//Assigning a to sum and b to carry
//make sure carry != 0