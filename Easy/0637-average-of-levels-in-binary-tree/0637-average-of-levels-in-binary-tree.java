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
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null){
            return Collections.emptyList();
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);        
        List<Double> list = new ArrayList();        
        
        while(!queue.isEmpty()){                      
            int size = queue.size();
            double levelSum = 0.0;
            
            for(int i = 0; i < size; i++){                
                TreeNode cur = queue.poll();                          
                levelSum += cur.val;
                
                if(cur.left != null){
                    queue.offer(cur.left);
                }
                if(cur.right != null){
                    queue.offer(cur.right);
                }
                
            }
            
            double average = levelSum / size;
            list.add(average);
        }
        
        return list;
    }
}