package com.pokemonbackend.demo.leetcode

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        //Add the answers to the hashMap. Key being the answer and the value being the index
        val hashMap = mutableMapOf<Int, Int>()

        for((index, element) in nums.withIndex()){
            val answer = target - element
            if(hashMap.containsKey(answer)){
                return intArrayOf(index, hashMap.get(answer)!!)
            }
            hashMap[element] = index
        }

        return intArrayOf()


    }

}