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
    public List<TreeNode> allPossibleFBT(int n) {
        return allPossibleFBT(n, new HashMap<>());
    }
    
    public List<TreeNode> allPossibleFBT(int n, HashMap<Integer, List<TreeNode>> map) {
        List<TreeNode> list = new ArrayList();
                        
        if(n == 1)
        {
            list.add(new TreeNode(0));
            return list;
        }            
        
        if(n / 2 == 0) 
            return list;
               
        
        if(map.containsKey(n))
            return map.get(n);
        
        for(int i = 1; i < n; i += 2)
        {            
            int j = n - 1 - i;
            List<TreeNode> left = allPossibleFBT(i, map);
            List<TreeNode> right = allPossibleFBT(j, map);
            
            
            for(TreeNode node1 : left)
            {      
                for(TreeNode node2 : right)
                {
                    TreeNode node = new TreeNode(0);
                    node.left = node1;
                    node.right = node2;                                
                                    
                    list.add(node);
                }                
            }                        
        }
        
        map.put(n, list);
        return list;
    }
}