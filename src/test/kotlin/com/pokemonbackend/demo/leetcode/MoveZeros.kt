package com.pokemonbackend.demo.leetcode

//https://leetcode.com/problems/move-zeroes/description/
class moveZeroes {
    fun moveZeroes(nums: IntArray): Unit {

        var fixedPointer = 0
        //traverse the entire inte array
        for(jumpingPointer in  nums.indices){
            if(nums[jumpingPointer]!= 0){
                if(jumpingPointer != fixedPointer){
                    //move the non zero element forward
                    nums[fixedPointer]  = nums[jumpingPointer]
                    nums[jumpingPointer] = 0
                }
                fixedPointer ++
            }

        }

    }
}