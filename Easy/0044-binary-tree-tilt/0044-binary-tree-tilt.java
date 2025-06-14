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
    private int sum = 0;

    public int findTilt(TreeNode root) {
        dfs(root);
        return sum;
    }

    private int dfs(TreeNode node)
    {
        if(node == null) return 0;

        int left = dfs(node.left);
        int right = dfs(node.right);

        int tilt = Math.abs(left - right);
        sum += tilt;

        return left + right + node.val;   
    }
}