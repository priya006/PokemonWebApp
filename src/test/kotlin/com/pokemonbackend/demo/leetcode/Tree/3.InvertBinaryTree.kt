package com.pokemonbackend.demo.leetcode.Tree

//https://leetcode.com/problems/invert-binary-tree/
class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) return null

        val left = invertTree(root.left)
        val right = invertTree(root.right)

        //swapping the children
        root.left = right
        root.right = left

        return root
    }
}


//Hint: look into the children and swap them recursively