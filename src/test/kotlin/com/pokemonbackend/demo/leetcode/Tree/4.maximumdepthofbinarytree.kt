package com.pokemonbackend.demo.leetcode.Tree

class maximumdepthofbinarytree {
    fun maxDepth(root: TreeNode?): Int {
        //edge case
        if(root == null) return 0

        //solving recursively
        val leftDepth = maxDepth(root.left)
        val rightDepth = maxDepth(root.right)

        return Math.max(leftDepth, rightDepth)+1

    }
}

//Solve it recursively
