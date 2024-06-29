package com.pokemonbackend.demo.leetcode.Array

class besttimetobuyandsellstock {
    fun maxProfit(prices: IntArray): Int {
        //If the input is zero
        if (prices.isEmpty()) return 0

        var leftPointer = 0
        var maxProfit = 0
        //traversing the array
        for(rightPointer in 1 until prices.size){
            //Check if buy is less < than sell and find the profit
            if(prices[leftPointer] < prices[rightPointer]){
                //find the profit
                var  profit = prices[rightPointer] - prices[leftPointer]
                maxProfit = Math.max(maxProfit, profit)
            }else{
                leftPointer = rightPointer
            }


        }
        return maxProfit
    }
}

//Hint: Two pointer. buy is leftpointer and sell is rightpointer. check if the buy is less than and find the profit.
//keep track of the maxprofit. when buy < sell not true. Move both the pointers