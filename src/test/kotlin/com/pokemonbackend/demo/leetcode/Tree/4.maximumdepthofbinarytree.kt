package com.pokemonbackend.demo.leetcode.Tree

//https://leetcode.com/problems/maximum-depth-of-binary-tree/
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
