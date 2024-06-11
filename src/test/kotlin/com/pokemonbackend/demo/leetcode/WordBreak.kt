package com.pokemonbackend.demo.leetcode

//https://leetcode.com/problems/word-break/description/
class WordBreak {

    fun wordBreak(s: String, wordDict: List<String>): Boolean {

        val wordDictSet = wordDict.toSet()
        val booleanArray = BooleanArray(s.length + 1)
        //For null String
        booleanArray[0] = true

        for (i in 1..s.length) {
            for (j in 0 until i) {
                if (booleanArray[j] && s.substring(j, i) in wordDictSet) {
                    booleanArray[i] = true
                    break
                }
            }


        }
        return booleanArray[s.length]
    }
}