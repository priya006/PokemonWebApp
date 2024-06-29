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

//Clarification: I have no idea why we are removing i-k-1
//Hint: If i cant add to hashset then return "true"
//remove the prior elements in the array when current element is > k
//"K" is the window size given size where the duplicates are found
//I am trying to find duplicates so I add elements to hashSet