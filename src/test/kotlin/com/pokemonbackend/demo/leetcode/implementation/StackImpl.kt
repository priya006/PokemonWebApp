package com.pokemonbackend.demo.leetcode.implementation
class StackImpl<T: Any?>: Stack<T> {
    private var list = arrayListOf<T>()

    override fun push(element: T) {
        list.add(element)
    }

    override fun pop(): T? {
        return list.removeLastOrNull()
    }

    override fun peek(): T? {
        return list.lastOrNull()
    }

    override val count: Int
        get() = list.size

    override fun isEmpty(): Boolean {
        return count == 0
    }
}

interface Stack<T: Any?> {
    val count: Int
    fun push(element: T): Unit
    fun peek(): T?
    fun pop(): T?
    fun isEmpty(): Boolean
}


fun main() {
    val stack = StackImpl<Char>()
    val inputString = "([])"

    for (char in inputString) {
        when (char) {
            '(', '{', '[' -> stack.push(char)
            '}' -> if (stack.isEmpty() || stack.pop() != '{') {
                println("Invalid input")
                return
            }
            ']' -> if (stack.isEmpty() || stack.pop() != '[') {
                println("Invalid input")
                return
            }
            ')' -> if (stack.isEmpty() || stack.pop() != '(') {
                println("Invalid input")
                return
            }
            else -> {
                println("Input correct characters")
                return
            }
        }
    }

    if (stack.isEmpty()) {
        println("Valid input")
    } else {
        println("Invalid input")
    }
}
