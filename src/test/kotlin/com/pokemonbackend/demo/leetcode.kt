//package com.pokemonbackend.demo
//
//class leetcode {
//
//    //Extension function
//    fun String.validParenthesis(): Boolean {
//        var stack = StackImpl<Char>()
//
//        for(char in this){
//            when(char){
//                '(' -> {
//                    stack.push(char)
//                }
//                ')' -> {
//                    if(stack.isEmpty){
//                        return false
//                    } else
//                    {
//                        stack.pop(char)
//                    }
//
//
//                }
//            }
//        }
//
//       return stack.isEmpty
//    }
//}
//
//
//fun main(){
//    println("(()}".validParenthesis())
//}