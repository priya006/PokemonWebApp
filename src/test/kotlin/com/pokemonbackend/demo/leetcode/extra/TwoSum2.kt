package com.pokemonbackend.demo.leetcode.extra

class TwoSum2 {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        //Two pointer technique
        var sum = 0
        var leftPointer = 0
        var rightPointer = numbers.size-1

        while(leftPointer < rightPointer){

            sum = numbers[leftPointer] + numbers[rightPointer]

            when{
                sum == target -> return intArrayOf(leftPointer + 1, rightPointer +1)
                sum < target -> leftPointer ++
                else -> rightPointer --
            }
        }
        throw  IllegalArgumentException("The inputs were wrong")
    }
}


//Hint:
//Sum = a + b
//The two pointers are coming from two directions
//The inputs is in ascending order that is a clue how to move forward the pointer 