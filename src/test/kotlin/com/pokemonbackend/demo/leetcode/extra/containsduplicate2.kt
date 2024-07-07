package com.pokemonbackend.demo.leetcode.extra

//https://leetcode.com/problems/contains-duplicate-ii/
class containsDuplicate2 {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = mutableMapOf<Int, Int>()

        for (i in nums.indices) {

            val num = nums[i]

            if (map.containsKey(num) && i - map[num]!! <= k) {
                return true
            }
            map[num] = i
        }

        return false
    }
}

//Clarification: I have no idea why we are removing i-k-1
//Hint: If i cant add to hashset then return "true"
//remove the prior elements in the array when current element is > k
//"K" is the window size given size where the duplicates are found
//I am trying to find duplicates so I add elements to hashSet