package com.pokemonbackend.demo.leetcode.Array

class containsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        var hashSet = hashSetOf<Int>()
        for(i in nums.indices){
            if(hashSet.contains(nums[i])){
                return true
            }else{
                hashSet.add(nums[i])
            }
        }
        return false
    }
}