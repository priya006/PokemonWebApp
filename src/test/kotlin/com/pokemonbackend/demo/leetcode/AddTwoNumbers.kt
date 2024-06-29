package com.pokemonbackend.demo.leetcode

import com.pokemonbackend.demo.leetcode.LinkedList.ListNode

//https://leetcode.com/problems/add-two-numbers/description/
class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var dummyHead = ListNode(0) // Dummy head node
        var current = dummyHead // Pointer to the resulting linked list
        var carry = 0
        var p = l1
        var q = l2

        while (p != null || q != null) {
            val x = p?.`val` ?: 0
            val y = q?.`val` ?: 0
            var sum = x + y + carry
            carry = sum / 10
            current.next = ListNode(sum % 10)
            current = current.next!! // Move to the next node
            p = p?.next
            q = q?.next
        }

        if (carry > 0) {
            current.next = ListNode(carry)
        }

        return dummyHead.next
    }
}