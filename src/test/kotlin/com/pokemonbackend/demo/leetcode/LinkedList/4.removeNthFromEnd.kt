package com.pokemonbackend.demo.leetcode.LinkedList

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var dummy = ListNode(0)
        //connecting dummy to the head
        dummy.next = head
        var slowPointer:ListNode? = dummy
        var fastPointer:ListNode? = dummy

        //important to use until. So that means fast pointer is moving n times ahead
        for(i in 0 until n){
            fastPointer = fastPointer?.next
        }

        while(fastPointer?.next != null){
            //move both the pointers
            slowPointer = slowPointer?.next
            fastPointer = fastPointer?.next
        }

        slowPointer?.next = slowPointer?.next?.next
        return dummy.next
    }
}
//Hint: Move the fast pointer n times head of the slow pointer.
//When the fast pointer.next = null then link the slowpointer next to slowpointer.next.next
//IMPORTANT: Putting the dummy node is the key to this problem

