package com.pokemonbackend.demo.leetcode.implementation

class QueueImpl<T:Any> : Queue<T> {

    private var storage = arrayListOf<T>()

    override fun deQueue(): T? {
             return if(isEmpty)  null else storage.removeAt(0)
    }

    override val count : Int = storage.size

    override val isEmpty : Boolean = count == 0

    override fun enQueue(element: T):Boolean{
        return storage.add(element)
    }

    override fun peek(): T? {
       return storage.getOrNull(0)
    }

}