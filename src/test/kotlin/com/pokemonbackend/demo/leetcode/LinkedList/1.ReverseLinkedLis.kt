package com.pokemonbackend.demo.leetcode.LinkedList

class ListNode(var value: Int) {
    var next: ListNode? = null
}

fun reverseLinkedList(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var curr: ListNode? = head

    while (curr != null) {
        val nextTemp = curr.next  // Store the value of next node
        curr.next = prev          // Reverse the link and point current to previous node
        prev = curr               // Move prev one step forward.
        curr = nextTemp           // assign the value for current
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


//fun reverseLinkedList(head:ListNode?):ListNode?{
//
//    var current:ListNode? = head
//    var previous:ListNode? = null
//
//
//    while(current!= null){
//        //store the next value into temp
//        val tempNextValue = current.next
//        //Point the current to previous to reverse the linkedList
//        current.next = previous
//        //Move the pointers forward
//        previous = current
//        //Assign the current the temp value
//        current = tempNextValue
//
//    }
//    return previous
//
//}
//
//
//class ListNode(val value:Int){
//    var previous:ListNode?= null
//    var next:ListNode? = null
//
//}
//
//fun main(){
//    val listNode = ListNode(1).apply{
//        next = ListNode(2)
//    }
//
//    val reverseList = reverseLinkedList(listNode)
//    var current:ListNode? = reverseList
//    while(current != null){
//        println("${current?.value}")
//        current = current.next
//    }
//
//}
