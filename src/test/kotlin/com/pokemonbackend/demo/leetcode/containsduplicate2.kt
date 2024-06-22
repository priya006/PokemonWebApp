package com.pokemonbackend.demo.leetcode

//https://leetcode.com/problems/contains-duplicate-ii/
class containsduplicate2 {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        //build a hashSet  of the window size K
        val hashSet = HashSet<Int>()
        //traverse the array
        for(i in nums.indices){
            //remove the leftmost element in the hashset if i> k
            if(i>k) hashSet.remove(nums[i-k-1])
            //If we could not add to hash set then it means there is duplicate
            if(!hashSet.add(nums[i])) return true
        }

        return false
    }
}