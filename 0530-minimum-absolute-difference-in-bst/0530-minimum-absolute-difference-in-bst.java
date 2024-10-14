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
    public int getMinimumDifference(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> list = new ArrayList<>();
        
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            list.add(cur.val);
            
            if(cur.left != null){
                queue.add(cur.left);
            }
            
            if(cur.right != null){
                queue.add(cur.right);
            }            
        }
        
        Collections.sort(list);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < list.size(); i++){
            int newMin = list.get(i) - list.get(i - 1);
            if(newMin < min){
                min = newMin;
            }            
        }
        
        return min;
    }
}