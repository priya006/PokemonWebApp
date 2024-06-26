package com.pokemonbackend.demo.leetcode

class maxProduct {
    fun maxProduct(nums: IntArray): Int {

        var minProduct = nums[0]
        var maxProduct = nums[0]
        var globalProduct = nums[0]

        for(i in 1 until nums.size){


            minProduct = minOf(nums[i], minProduct*nums[i])
            maxProduct = maxOf(nums[i], maxProduct*nums[i])

            if(nums[i] < 0){
                //swap min and max product with temp variable
                var temp = maxProduct
                maxProduct = minProduct
                minProduct = temp
            }

            globalProduct = maxOf(globalProduct, maxProduct)

        }
        return globalProduct

    }
}

//Hint: get the min and max product. walk through the array and get the min and max of current element and currentelement*min,currentelement*max
//return the globalmax. by checking between globalMax and productMax