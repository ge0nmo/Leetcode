/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) 
            return 0;
        
        return sumOfLeftLeaves(root, false);
    }
    
    public int sumOfLeftLeaves(TreeNode root, boolean isLeft){
        if(root == null){
            return 0;
        }
        
        if(root.left == null && root.right == null){
            if(isLeft){
                return root.val;
            }
        }
        
        return sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);                
    }
}