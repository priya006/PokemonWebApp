package com.pokemonbackend.demo.leetcode

class longestrepeatingcharacterreplacement {
    fun characterReplacement(s: String, k: Int): Int {

        var hashMap = mutableMapOf<Char,Int>()
        var mostFrequenetCharacter = 0
        //sliding window
        var fixedPointer = 0
        var jumingPointer = 0
        var repeatingCharacter = 0
        var max = 0

        for(jumingPointer in 0 until s.length){
            hashMap.put(s[jumingPointer], hashMap.getOrDefault(s[jumingPointer],0)+1)
            repeatingCharacter = Math.max(repeatingCharacter, hashMap.get(s[jumingPointer])!!)
            var window = jumingPointer - fixedPointer + 1
            if(window - repeatingCharacter >= k){
                hashMap.put(s[jumingPointer] ,hashMap.get(s[jumingPointer])!!-1 )
                fixedPointer ++
            }
            max = Math.max(max, window)
        }
        return  max
    }
}