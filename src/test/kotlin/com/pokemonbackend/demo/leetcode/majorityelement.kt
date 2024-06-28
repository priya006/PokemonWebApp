package com.pokemonbackend.demo.leetcode

class MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        var count = 0
        var result = 0

        for(i in nums.indices){

            if(count == 0){
                result = nums[i]
            }else{
                count += if(result == nums[i]) 1 else -1
            }

        }
        return result
    }
}

//Hint:Boyers-moyers algorithm.Keep the result and the count.If you see the number in the "count" becoming
//zero then change the result being the current element in array
//else increase the count when result == element from array else decrement the count