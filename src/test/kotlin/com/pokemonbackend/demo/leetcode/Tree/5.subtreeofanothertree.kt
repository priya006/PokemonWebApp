package com.pokemonbackend.demo.leetcode.Tree

class subtreeofanothertree {
    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        // If subRoot is null, it is a subtree of any tree
        if (subRoot == null) return true
        // If root is null but subRoot is not, subRoot cannot be a subtree
        if (root == null) return false

        // Check if the current trees rooted at root and subRoot are identical
        if (isSameTree(root, subRoot)) return true

        // Otherwise, check if subRoot is a subtree of either the left or right subtree of root
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)
    }

    private fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        // Base case: if both trees are empty, they are identical
        if (p == null && q == null) return true
        // If one of the trees is empty, they are not identical
        if (p == null || q == null) return false
        // If the values of the current nodes are different, the trees are not identical
        if (p.`val` != q.`val`) return false

        // Recursively check if the left and right subtrees are identical
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    }
}

//Hint:
//Think of recursively calling isSameTree
//first wholly check
//Then check if left and right has the subroot 