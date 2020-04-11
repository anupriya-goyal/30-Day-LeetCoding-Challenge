//Diameter of Binary Tree

/*
Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree

          1
         / \
        2   3
       / \     
      4   5    
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
     
        if(root==null)
        {
            return 0;
        }
        int left_h=height(root.left);
        int right_h=height(root.right);
        
       int  left_dia=diameterOfBinaryTree(root.left);
       int right_dia=diameterOfBinaryTree(root.right);
        
        return Math.max(left_h+right_h, Math.max(left_dia,right_dia));
    }
    
    public int height(TreeNode root )
    {
        if(root==null)
        {
            return 0;
        }
        else
        {
            return 1+Math.max(height(root.left),height(root.right));
        }
    }
    
}