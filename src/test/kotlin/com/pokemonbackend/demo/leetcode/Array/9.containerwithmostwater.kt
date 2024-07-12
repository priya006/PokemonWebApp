package com.pokemonbackend.demo.leetcode.Array

class containerwithmostwater {
    fun maxArea(height: IntArray): Int {
        var maxArea = 0
        var minHeight = 0
        var leftPointer = 0
        var rightPointer = height.size-1
        while(leftPointer < rightPointer){
            minHeight = Math.min(height[rightPointer], height[leftPointer])
            maxArea = Math.max(maxArea, minHeight * (rightPointer - leftPointer))


            if(height[leftPointer] < height[rightPointer]){
                //look for taller 
                leftPointer ++
            }else{
                rightPointer --
            }
        }


        return maxArea

        //how the pointers move

    }
}

//Hint:
//Two pointers
//Max area = (min height) * (width between the two pointers)
//The loop runs as much as two pointers dont meet from both the direction