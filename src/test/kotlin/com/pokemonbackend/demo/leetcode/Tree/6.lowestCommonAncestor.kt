package com.pokemonbackend.demo.leetcode.Tree

class lowestCommonAncestor {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        var currentNode = root

        while(currentNode != null){
            if(p!!.`val` < currentNode.`val` && q!!.`val` < currentNode.`val`)
                currentNode = currentNode.left
            else if(p!!.`val` > currentNode.`val` && q!!.`val` > currentNode.`val`){
                currentNode = currentNode.right
            } else{
                return   currentNode
            }
        }
        return null

    }
}

//Hint:
//Check whether the p value < root. If yes then move to left, else move to right
//The split use case is the root is the common ancestor

