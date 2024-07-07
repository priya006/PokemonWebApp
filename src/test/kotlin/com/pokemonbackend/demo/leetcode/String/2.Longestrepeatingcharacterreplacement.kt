package com.pokemonbackend.demo.leetcode.String

class longestrepeatingcharacterreplacement {
    fun characterReplacement(s: String, k: Int): Int {
        var jumpingPointer = 0
        var fixedPointer = 0
        var maxRepeatingCharacter = 0
        var maxSubstringLength = 0
        val hashMap = mutableMapOf<Char, Int>()

        // Traversing the given String
        while (jumpingPointer < s.length) {
            hashMap[s[jumpingPointer]] = hashMap.getOrDefault(s[jumpingPointer], 0) + 1
            maxRepeatingCharacter = Math.max(maxRepeatingCharacter, hashMap[s[jumpingPointer]]!!)

            val windowLength = jumpingPointer - fixedPointer + 1

            // If the current window is invalid (more than k replacements needed), shrink the window
            if (windowLength - maxRepeatingCharacter > k) {
                hashMap[s[fixedPointer]] = hashMap[s[fixedPointer]]!! - 1
                fixedPointer++
            }

            // Update the maximum substring length after potentially shrinking the window
            maxSubstringLength = Math.max(maxSubstringLength, jumpingPointer - fixedPointer + 1)

            jumpingPointer++
        }

        return maxSubstringLength
    }
}

//Hint:
//Sliding window
//jumpingPointer - fixedPointer + 1 - this is how we calculate the substring