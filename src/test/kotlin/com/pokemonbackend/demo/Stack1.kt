package com.pokemonbackend.demo

interface Stack1<T : Any> {

    //Add the operations of stack

    fun peek(element : T):T?

    fun push(element : T)

    fun pop(element: T) : T?

    val count : Int

    val isEmpty : Boolean
        get() = count==0



}