package com.pokemonbackend.demo.leetcode.Tree

import java.util.LinkedList
import java.util.Queue

//https://leetcode.com/problems/binary-tree-level-order-traversal/description/

class binarytreelevelordertraversal {
    fun levelOrder(root: TreeNode?): List<List<Int>> {

        var queue: Queue<TreeNode> = LinkedList()
        var result = mutableListOf<List<Int>>()


        //return empty List
        if(root == null ) return result
        queue.add(root)
        while(queue.isNotEmpty()){
            var currentLevelList = mutableListOf<Int>()
            var queueSize = queue.size



            for(i in 0 until queueSize){
                //deque
                var currentNode = queue.poll()
                currentLevelList.add(currentNode.`val`)

                currentNode.left?.let{queue.add(it) }
                currentNode.right?.let{queue.add(it)}

            }
            result.add(currentLevelList)
        }

        return result

    }
}

//Hint: Breadth first search
//Level by level add to the Que
//Deque the que and add to list
//The queue size is important to know and go left and right it is available from the node and add to queue
//now add the list to big list
//continue the process as long as queue is empty