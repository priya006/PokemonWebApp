package com.pokemonbackend.demo.leetcode.Binary

//https://leetcode.com/problems/sum-of-two-integers/

class sumOfTwoIntegers {
    fun getSum(a: Int, b: Int): Int {

        var firstNumber = a
        var secondNumber = b
        var carry = 0


        //Logic for adding
        while(secondNumber != 0){
            carry = (firstNumber and secondNumber) shl 1
            firstNumber = firstNumber xor secondNumber
            secondNumber = carry
        }
        return firstNumber
    }

}
//Hint:
//Assiging x = a , y = b is mandate. So we dont mess with a and b
//anding gives us the carry
//whe you xor the second time u must xor with carry
//when anding we must think what is the second number. If that is 0 then we must exit the loop