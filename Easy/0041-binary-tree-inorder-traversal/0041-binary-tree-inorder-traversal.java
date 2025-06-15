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
    private List<Integer> list = new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {
        dfs(root);
        return list;
    }

    private void dfs(TreeNode node)
    {
        if(node == null) return;

        dfs(node.left);
        list.add(node.val);
        dfs(node.right);
    }
}

// 왼쪽부터 차례로 재귀
// null인 경우 -1을 리턴
// return 값이 -1일때 더 이상 왼쪽에 없다는 뜻이므로 node.val을 array에 추가
// 