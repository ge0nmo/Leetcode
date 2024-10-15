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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null){
            return null;
        }
        
        int val = 0;
        TreeNode left;
        TreeNode right;
        
        if(root1 != null && root2 != null){
            val = root1.val + root2.val;
            left = mergeTrees(root1.left, root2.left);
            right = mergeTrees(root1.right, root2.right);
        } else if(root1 != null){
            val = root1.val;
            left = mergeTrees(root1.left, null);
            right = mergeTrees(root1.right, null);
        } else{
            val = root2.val;
            left = mergeTrees(null, root2.left);
            right = mergeTrees(null, root2.right);
        }
        
        
        return new TreeNode(val, left, right);        
    }
}

// 양쪽 모두가 null일때까지 아래로 내려간다
// 한쪽이라도 존재하면 합침