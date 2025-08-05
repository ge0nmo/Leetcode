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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList();
        dfs(root, answer, 0);
        return answer;
    }

    public void dfs(TreeNode node, List<List<Integer>> answer, int level)
    {
        if(node == null) return;

        if(answer.size() <= level){
            answer.add(new ArrayList<Integer>());
        }

        answer.get(level).add(node.val);

        dfs(node.left, answer, level + 1);
        dfs(node.right, answer, level + 1);
    }    
}