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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        return maxDepth(root, 1);
    }
    
    public int maxDepth(TreeNode root, int depth){
        if(root == null){
            return depth;
        }
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        
        if(left == null && right == null){
            return depth;
        } 
        
        ++depth;
        
        int leftMax = maxDepth(root.left, depth);
        int rightMax = maxDepth(root.right, depth);
        
        return Math.max(leftMax, rightMax);        
    }
    
    
}