package com.pokemonbackend.demo.leetcode.Array

class threeSum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        nums.sort() // Sort the array

        for (i in nums.indices) {
            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) continue

            var left = i + 1
            var right = nums.size - 1

            while (left < right) {
                val sum = nums[i] + nums[left] + nums[right]

                when {
                    sum == 0 -> {
                        result.add(listOf(nums[i], nums[left], nums[right]))
                        left++
                        right--
                        // Skip duplicates for the left pointer
                        while (left < right && nums[left] == nums[left - 1]) left++
                        // Skip duplicates for the right pointer
                        while (left < right && nums[right] == nums[right + 1]) right--
                    }
                    sum < 0 -> left++
                    else -> right--
                }
            }
        }

        return result
    }
}

//Hint:
//Have three pointers i,leftPointer and rightpointer
//leftPointer and rightPointer almost uses the same concept of two pointers from sum2 problem using when
//Skip the duplicates. So "sorting" is mandate
