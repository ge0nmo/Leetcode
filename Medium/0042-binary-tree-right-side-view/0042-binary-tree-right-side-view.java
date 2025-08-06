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
        Map<Integer, Integer> map = new HashMap();
        dfs(root, 0, map);

        return map.values().stream().toList();
    }

    public void dfs(TreeNode node, int level, Map<Integer, Integer> map)
    {
        if(node == null) return;

        map.put(level, node.val);

        dfs(node.left, level + 1, map);
        dfs(node.right, level + 1, map);        
    }
}