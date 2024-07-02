package com.pokemonbackend.demo.leetcode.String

//https://leetcode.com/problems/valid-anagram/

class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        //it is important to check initially if the two strings are equal
        if(s.length != t.length) return false
        val count = IntArray(26) //each small case alphabet holds a place here

        //Adding value for each character
        for(char in s){
            count[char - 'a']++
        }

        for(char in t){
            count[char - 'a']--
        }

        for(i in count){
            if(i != 0) return false
        }
        return true
    }
}

//Hint:
//fill the array with 26 size[0,0,0,0,0....]
//add the number of characters u see in string into intArray
//subtract the characters from the next string
//now iterate the int array and check if all the value is zero
//if all the values are 0 then two strings are equal