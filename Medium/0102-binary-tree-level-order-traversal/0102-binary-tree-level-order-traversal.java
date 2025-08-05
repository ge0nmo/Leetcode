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
    private Map<Integer, List<Integer>> map = new HashMap();
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        dfs(root, 0);

        List<List<Integer>> answer = new ArrayList();

        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            Integer key = iterator.next();
            answer.add(map.get(key));
        }

        return answer;
    }

    public void dfs(TreeNode node, int level)
    {
        if(node == null) return;

        map.computeIfAbsent(level, k -> new ArrayList<>()).add(node.val);

        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }    
}