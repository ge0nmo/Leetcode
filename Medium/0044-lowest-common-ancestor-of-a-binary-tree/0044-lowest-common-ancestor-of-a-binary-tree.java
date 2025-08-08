/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private TreeNode answer;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);

        return answer;
    }

    public boolean dfs(TreeNode node, TreeNode p, TreeNode q)
    {
        if(node == null) return false;

        boolean cur = false;
        if(node.val == p.val || node.val == q.val) cur = true;

        boolean left = dfs(node.left, p, q);
        boolean right = dfs(node.right, p, q);

        if(cur && (left || right)) answer = node;

        if(left && right) answer = node;

        return cur || left || right;
    }
}

// dfs로 순회
// val이 p나 q와 같으면 true
// 해당 node.val에서 true, left, right 중에 하나에서 true가 나오면 해당 node.val이 정답
