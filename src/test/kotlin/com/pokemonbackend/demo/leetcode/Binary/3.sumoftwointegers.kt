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
//the reason we are going shift left because of the carry
//sum does not care about carry
//According to video we are doing XOR and then we do shift left because we have a carry