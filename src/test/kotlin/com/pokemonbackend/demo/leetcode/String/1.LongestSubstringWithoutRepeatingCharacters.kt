package com.pokemonbackend.demo.leetcode.String

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
class LongestSubstringWithoutRepeatingCharacters {
    fun lengthOfLongestSubstring(s: String): Int {
        var hashSet = HashSet<Char>()
        var max = 0 // Keeping track of the maximum length of the unique substrings
        var a_pointer = 0 //move around
        var b_pointer = 0

        while(a_pointer < s.length){
            if(!hashSet.contains(s[a_pointer])){
                hashSet.add(s[a_pointer])
                max = Math.max(hashSet.size,max)
                a_pointer ++
            }else{
                hashSet.remove(s[b_pointer])
                b_pointer ++
            }
        }

        return max

    }
}


//Hint: [Sliding window] Remember to track the max. get the maxOf(hashset.size, max) after u add character to the hashSet