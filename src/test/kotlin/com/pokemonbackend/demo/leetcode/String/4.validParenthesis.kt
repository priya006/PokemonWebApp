package com.pokemonbackend.demo.leetcode.String

import java.util.Stack

//https://leetcode.com/problems/valid-parentheses/

class validparenthesis {
    fun isValid(s: String): Boolean {

        var stack = Stack<Char>()

        for(char in s){
            when(char){
                '(','[','{' -> stack.push(char)
                '}' -> if(stack.isEmpty() || stack.pop() != '{') return false
                ']' -> if(stack.isEmpty() || stack.pop() != '[') return false
                ')' -> if(stack.isEmpty() || stack.pop() != '(') return false
            }
        }
        return stack.isEmpty()
    }
}

//Hint:
//edge case. If the closing bracket comes first and the stack is empty. then return fasle
//If it is opening brackets just push to stack
//If it is closing bracket just pop and check. If it does not match the closing then return false
//End of the day. The stack must be empty or balaced to return true
