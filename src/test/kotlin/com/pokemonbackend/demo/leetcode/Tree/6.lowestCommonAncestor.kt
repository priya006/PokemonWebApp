package com.pokemonbackend.demo.leetcode.Tree

//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
class lowestCommonAncestor {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        // Base case
        if (root == null || root == p || root == q) {
            return root
        }

        // Recur for left and right subtrees
        val left = lowestCommonAncestor(root.left, p, q)
        val right = lowestCommonAncestor(root.right, p, q)

        // If both left and right are non-null, root is the LCA
        if (left != null && right != null) {
            return root
        }

        // Otherwise, return the non-null value
        return left ?: right
    }
}

//Hint:
//Check whether the p value < root. If yes then move to left, else move to right
//The split use case is the root is the common ancestor

