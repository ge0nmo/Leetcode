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
    public boolean findTarget(TreeNode root, int k) {
        return findTarget(root, k, new HashSet<Integer>());
    }
    
    public boolean findTarget(TreeNode root, int k, Set<Integer> set){
        if(root == null){
            return false;
        }
        
        if(set.contains(k - root.val)){
            return true;
        } 
        
        set.add(root.val);
        
                
        return findTarget(root.left, k, set) || findTarget(root.right, k, set);
    }
}