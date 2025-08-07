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
    private int count = 0;
    private int result = 0;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        dfs(root);
        return result;
    }

    public void dfs(TreeNode node)
    {
        if(node == null || count == 0) return;

        dfs(node.left);        

        if(count == 0) {            
            return;
        }

        count--;
        if(count == 0){
            result = node.val;
            return;
        }

        dfs(node.right);
    }
}