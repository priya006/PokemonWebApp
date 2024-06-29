package com.pokemonbackend.demo.leetcode.Array

class productofarrayexceptself {
    fun productExceptSelf(nums: IntArray): IntArray {

        var prefix = 1
        var postfix = 1
        val resultArray = IntArray(nums.size)

        //walk the array
        for(i in nums.indices){
            resultArray[i] = prefix
            prefix *= nums[i]
        }


        //walk the array in reverse order
        for(i in nums.indices.reversed()){
            resultArray[i] *= postfix
            postfix *= nums[i]
        }
        return resultArray
    }
}

//Hint: Keep the prefix and post fix as "1" Wal through the array and resulting array is what is in prefix,
//get the refix by mutiplying what is in input array.
//Walk the array again in reverse order. now resulting array is got by mutiplying it with postfix
//postifx is got by mutiplying with input array