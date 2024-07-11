package com.pokemonbackend.demo.leetcode.Array

class findminimuminrotatedsortedarray {
    fun findMin(nums: IntArray): Int {
        var left = 0
        var right = nums.size-1
        var mid = 0

        while(left < right){

            //find the mid value
            mid = left + (right - left)/2


            if(nums[mid] > nums[right])
            {
                //searching to the right
                left = mid + 1
            }else{
                //searching to the left
                right = mid
            }

        }
        return nums[left]
    }
}

//Hint:
//There are two arrays that has to be search left or right
//After finding the minimum you must think if u must search left r right
//If the input is rotated "sorted" array then  "visuvalise"  it