package com.pokemonbackend.demo.leetcode.LinkedList

class ReorderList {
    fun reorderList(head: ListNode?) {
        //Splitting into two linked list using slow and fast pointer
        var slowPointer:ListNode? = head
        var fastPointer:ListNode? = head

        while(fastPointer?.next != null || fastPointer?.next?.next != null){
            slowPointer = slowPointer?.next
            fastPointer = fastPointer?.next?.next
        }

        //Split into two linked List
        var h2:ListNode? = slowPointer?.next
        var h1:ListNode? = head
        slowPointer?.next = null //detatching the first linked list

        //reverse the h2 linked list
        var current:ListNode?= h2
        var previous:ListNode? = null

        while(current != null){
            val tempNext = current.next
            current.next = previous
            previous = current
            current = tempNext
        }
        //return the reverse linked list
        h2 = previous

        while(h1 != null && h2 != null){
            val nextTemp = h1.next
            h1.next = h2

            h1 = h2
            h2 = nextTemp
        }

    }
}

//Hint:1. Split the linked list into two linked list using slow and fast pointer (hare and tortoise)
//2.Now reverse the second linked list
//3.Now merge the two linked list