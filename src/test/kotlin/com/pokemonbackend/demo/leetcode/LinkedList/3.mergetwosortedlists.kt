package com.pokemonbackend.demo.leetcode.LinkedList

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class mergeTwoLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

        var dummy = ListNode(0)
        var tail = dummy
        var l1 = list1
        var l2 = list2

        while(l1!= null && l2!= null){
            if(l1.`val` <= l2.`val`){
                tail.next = ListNode(l1.`val`)
                l1 = l1.next
            }else{
                tail.next = ListNode(l2.`val`)
                l2 = l2.next
            }
            tail = tail.next!!
        }
        //edge case
        tail?.next = l1 ?: l2
        return dummy.next
    }
}

//Hint: create a Node where u can save the results
//Look into first value of first linked list <= first value of second linked list.
//if yes add to the resulting node
//else take up the second linked list value and add to result
//edge case: If there are hanging values in the linked list pls append to the resulting linked list
