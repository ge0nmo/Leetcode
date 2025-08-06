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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer = new ArrayList();
        dfs(root, 0, answer);

        return answer;
    }

    public void dfs(TreeNode node, int level, List<Integer> answer)
    {
        if(node == null) return;

        if(answer.size() == level) answer.add(node.val);

        dfs(node.right, level + 1, answer);   
        dfs(node.left, level + 1, answer);             
    }
}