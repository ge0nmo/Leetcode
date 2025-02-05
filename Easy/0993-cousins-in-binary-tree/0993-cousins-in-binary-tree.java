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
    public boolean isCousins(TreeNode root, int x, int y) {
        return isCousins(root, x, y, 0, 0, new HashMap<Integer, Integer[]>());
    }
    
    public boolean isCousins(TreeNode root, int x, int y, int parent, int depth, Map<Integer, Integer[]> map){
        if(root == null){
            return false;
        }
        
        if(root.val == x || root.val == y){
            map.put(root.val, new Integer[]{parent, depth});
        }
        
        if(map.containsKey(x) && map.containsKey(y)){
            Integer[] xInt = map.get(x);
            Integer[] yInt = map.get(y);
            
            if(xInt[0] != yInt[0] && xInt[1] == yInt[1]){
                return true;
            }
        }
        
        
        return isCousins(root.left, x, y, root.val, depth + 1, map) 
            || isCousins(root.right, x, y, root.val, depth + 1, map);
    }
}

// map에 x와 y를 key로 저장
// value에 int 배열 저장
// value[0] = parent value, value[1] = depth