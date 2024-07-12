package com.pokemonbackend.demo.leetcode.Array

//https://leetcode.com/problems/search-in-rotated-sorted-array/
class searchinrotatedsortedarray {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        var mid = 0

        while (left <= right) {
            mid = left + (right - left) / 2

            if (nums[mid] == target) {
                return mid  // Found the target
            }

            // Check if the left half is sorted
            if (nums[left] <= nums[mid]) {
                // Check if the target is in the sorted left half
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1
                } else {
                    left = mid + 1
                }
            } else {
                // Right half is sorted, check if the target is in the sorted right half
                if (target <= nums[right] && nums[mid] < target) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }
        }

        return -1  // Target not found
    }
}

//Hint:
//First find the mid
//assuming that left side is sorted search in left side
//assuming that right side is sorted search in right side