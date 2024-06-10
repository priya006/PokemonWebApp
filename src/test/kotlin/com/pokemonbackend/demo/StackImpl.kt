//package com.pokemonbackend.demo
//
//class StackImpl<T : Any> : Stack<T> {
//
//    private  var storage = arrayListOf<T>()
//
//    override val count: Int
//        get() =  storage.size
//
//    override fun push(element: T)  {
//         storage.add(element)
//    }
//
//    override fun pop(element: T) : T?{
//       return storage.removeLastOrNull()
//    }
//
//    override fun peek(element : T) : T?{
//      return  storage.lastOrNull()
//    }
//
//}