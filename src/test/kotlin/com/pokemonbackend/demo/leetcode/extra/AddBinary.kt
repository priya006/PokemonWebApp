package com.pokemonbackend.demo.leetcode.extra

//https://leetcode.com/problems/add-binary/description/
class Solution {
    fun addBinary(a: String, b: String): String {
        //sum is appended to the resulting string builder
        var stringBuilder = StringBuilder()
        var i = a.length-1
        var j = b.length-1
        var carry = 0

        while(i>= 0 || j>= 0){
            var sum = carry
            if(i>=0){
                sum += a[i] - '0'
                i--
            }


            if(j>= 0){
                sum += b[j] - '0'
                j--
            }

            stringBuilder.append(sum%2)
            carry = sum/2
        }
        //Hanging out carry. must be outside the loop
        if(carry!= 0 ) stringBuilder.append(carry)
        return stringBuilder.reverse().toString()

    }
}

//Hint:Think about how u will add two nos. Get the last element



