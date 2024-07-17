package com.pokemonbackend.demo.leetcode.Tree



class BalancedTree {
    fun isBalanced(root: TreeNode?): Boolean {
        return checkHeight(root) != -1
    }

    private fun checkHeight(node: TreeNode?): Int {
        if (node == null) return 0

        val leftHeight = checkHeight(node.left)
        if (leftHeight == -1) return -1

        val rightHeight = checkHeight(node.right)
        if (rightHeight == -1) return -1

        if (Math.abs(leftHeight - rightHeight) > 1) return -1

        return 1 + Math.max(leftHeight, rightHeight)
    }
}


//Hint:
//Check if the tree is balanced in all the nodes
