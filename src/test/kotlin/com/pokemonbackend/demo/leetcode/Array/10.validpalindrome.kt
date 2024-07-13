package com.pokemonbackend.demo.leetcode.Array

//https://leetcode.com/problems/valid-palindrome/
class Solution {
    fun isPalindrome(s: String): Boolean {
        //two pointer. Make sure left and right pointer does not cross each other
        var leftPointer = 0
        var rightPointer = s.length-1

        while(leftPointer < rightPointer){
            //skip charcters other than alphanumeric
            while(leftPointer < rightPointer && !s[leftPointer].isLetterOrDigit()){
                leftPointer ++
            }



            while(leftPointer < rightPointer && !s[rightPointer].isLetterOrDigit()){
                rightPointer --
            }

            //return boolean
            if(s[leftPointer].lowercase() != s[rightPointer].lowercase()){
                return false
            }

            leftPointer ++
            rightPointer --
        }
        return true
    }
}


//HInt:
//Two Pointer Technique
//Make sure the two pointer does not cross each other
//first ignore the special characters both the sides
//take each character from left and right conver to lower case and make sure they  are equal