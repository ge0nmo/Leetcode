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
        return findTarget(root, k, new HashMap<Integer, TreeNode>());
    }
    
    public boolean findTarget(TreeNode root, int k, Map<Integer, TreeNode> map){
        if(root == null){
            return false;
        }
        
        if(map.containsKey(k - root.val)){
            return true;
        } 
        
        if(!map.containsKey(root.val)){
            map.put(root.val, root);    
        }
        
                
        return findTarget(root.left, k, map) || findTarget(root.right, k, map);
    }
}