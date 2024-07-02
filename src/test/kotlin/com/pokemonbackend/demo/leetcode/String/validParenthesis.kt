package com.pokemonbackend.demo.leetcode.String

//Writting extension function for String

fun String.validParenthesis(balanceTheString : String) : Boolean{
    var balance = 0
    for(char in this){
        when(char){
            '(' -> {
                balance ++
            }
            ')' ->{
                balance --
                if(balance < 0) return false
            }
        }
    }

    return balance == 0

}

fun main(){
    class Solution {
        fun wordBreak(s: String, wordDict: List<String>): Boolean {

            val wordDictSet = wordDict.toSet()
            val booleanArray = BooleanArray(s.length + 1)
            //For null String
            booleanArray[0] = true

            for (i in 1..s.length - 1) {
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

}