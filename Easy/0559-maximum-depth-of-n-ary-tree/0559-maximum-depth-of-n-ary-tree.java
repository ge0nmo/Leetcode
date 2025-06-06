/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        
        return maxDepth(root, 1);
    }
    
    public int maxDepth(Node root, int depth){
        if(root == null || root.children.isEmpty()){
            return depth;
        }
                
        int max = depth;
        for(Node child : root.children){
            int nextDepth = maxDepth(child, depth + 1);
            max = Math.max(max, nextDepth);
        }
        
        return max;
    }
}