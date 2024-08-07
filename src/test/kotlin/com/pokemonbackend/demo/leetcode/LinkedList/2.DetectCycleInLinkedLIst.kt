package com.pokemonbackend.demo.leetcode.LinkedList

import com.pokemonbackend.demo.leetcode.LinkedList.ListNode

class linkedlistcycle {

    fun hasCycle(head: ListNode?): Boolean {
        //edge case
        if(head == null || head.next == null) return false
        var slow: ListNode? = head
        var fast: ListNode? =  head
        while(fast != null && fast.next != null){
            fast = fast?.next?.next
            slow = slow?.next
            if(fast == slow)  return true
        }
        return false

    }
}


//Hint:Floyd's and tortise and hare.
//when they both meet. That means there is a cycle return true