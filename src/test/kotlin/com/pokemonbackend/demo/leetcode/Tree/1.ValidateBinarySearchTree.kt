package com.pokemonbackend.demo.leetcode.Tree



class ValidateBinarySearchTree {
    fun isValidBST(root: TreeNode?): Boolean {
        return validate(root,null,null)
    }

    //private function to recursively find if the given tree is binary tree.
    private fun validate(node:TreeNode?, min:Int?, max:Int?):Boolean{
        //edge case
        if(node == null) return true

        if((min != null && node.`val` <= min) || (max != null && node.`val` >= max) ) return false

        return validate(node.left, min, node.`val`) && validate(node.right, node.`val`, max)

    }
}

