package com.pokemonbackend.demo.leetcode.implementation

interface Queue<T:Any> {

    fun deQueue():T?

    fun enQueue(element: T): Boolean

    val count : Int

    val isEmpty: Boolean

    fun peek():T?

}