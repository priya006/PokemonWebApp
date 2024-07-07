package com.pokemonbackend.demo.leetcode.extra

import com.pokemonbackend.demo.leetcode.LinkedList.ListNode

//https://leetcode.com/problems/add-two-numbers/description/

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class addTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var dummy:ListNode? = ListNode(0)
        var l3 = dummy
        var carry = 0
        var sum = 0
        var list1:ListNode? = l1
        var list2:ListNode? = l2
        while(list1 != null || list2 != null){
            sum = carry
            if(list1?.`val` != null){

                sum += list1.`val`
                list1 = list1?.next
            }
            if(list2?.`val` != null){

                sum += list2.`val`
                list2 = list2?.next
            }
            l3?.next = ListNode(sum%10)
            carry = sum/10
            l3 = l3?.next!!

        }
        if(carry !=0) l3?.next = ListNode(carry)

        return dummy?.next

    }


}
