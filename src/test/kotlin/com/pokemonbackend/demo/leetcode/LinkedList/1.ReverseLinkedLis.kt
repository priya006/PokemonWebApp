package com.pokemonbackend.demo.leetcode.LinkedList

class ListNode(var value: Int) {
    var next: ListNode? = null
}

fun reverseLinkedList(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var curr: ListNode? = head

    while (curr != null) {
        val nextTemp = curr.next  // Store next node
        curr.next = prev          // Reverse the link
        prev = curr               // Move prev one step forward
        curr = nextTemp           // Move curr one step forward
    }

    return prev  // prev is the new head of the reversed list
}

// Example usage:
// Constructing a linked list 1 -> 2 -> 3 -> 4 -> 5
fun main() {
    val head = ListNode(1).apply {
        next = ListNode(2).apply {
            next = ListNode(3).apply {
                next = ListNode(4).apply {
                    next = ListNode(5)
                }
            }
        }
    }

    var reversedHead = reverseLinkedList(head)

    // Printing the reversed list
    while (reversedHead != null) {
        print("${reversedHead.value} -> ")
        reversedHead = reversedHead.next
    }
    println("null")
}

//Hint: Two pointers.
// 1.Store the data,
// 2.break the link,
// 3.current must link to previous(move forward)
// 4. put the temp data to current
