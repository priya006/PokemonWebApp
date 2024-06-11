package com.pokemonbackend.demo.leetcode

class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var dummyHead = ListNode(0) //Place holder
        var current = dummyHead //pointer for the resulting linked list dummyHead
        var carry = 0
        var p = l1
        var q = l2

        while(l1 != null || l2 != null){
            var sum = carry
            var x = p?.`val` ?: 0
            var y = q?.`val` ?: 0

            sum = x + y + carry
            carry = sum/10
            current.next = ListNode(sum%10)
            p = p?.next
            q = q?.next
        }

        if(carry > 0) current.next = ListNode(carry)
        return dummyHead.next
    }
}