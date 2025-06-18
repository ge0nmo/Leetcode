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
    private List<Integer> list = new ArrayList();
    public List<Integer> preorder(Node root) {
        dfs(root);
        return list;
    }

    public void dfs(Node node)
    {
        if(node == null) return;
        list.add(node.val);
        List<Node> children = node.children;
        for(Node child : children){
            dfs(child);
        }
    }
}