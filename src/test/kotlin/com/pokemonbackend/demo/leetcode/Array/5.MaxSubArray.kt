package com.pokemonbackend.demo.leetcode.Array

class maxSubArray {
    fun maxSubArray(nums: IntArray): Int {
        //Kadanes algorithm
        var currentSum = nums[0]
        var globalSum = nums[0]

        for(i in 1 until nums.size){
            currentSum = maxOf(nums[i], currentSum+nums[i])

            if(currentSum > globalSum){
                globalSum = currentSum
            }
        }
        return globalSum
    }
}

//Hint:I look into the current element in the array and find if that is maximum or the subarray is maximum,
//If the currentSum is greater than gloabl sum. Then update the global sum