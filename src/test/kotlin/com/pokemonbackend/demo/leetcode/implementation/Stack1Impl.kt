package com.pokemonbackend.demo.leetcode.implementation

class Stack1Impl<T: Any> : Stack1<T> {

    private var storage = arrayListOf<T>()

    override fun peek(element : T):T?{
          return  storage.lastOrNull()
    }

    override fun push(element : T){
        storage.add(element)
    }

    override fun pop(element: T):T?{
        return storage.removeLastOrNull()
    }

    override val count : Int
      get() = storage.size
}