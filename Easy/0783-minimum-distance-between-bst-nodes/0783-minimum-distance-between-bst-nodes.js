/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var minDiffInBST = function(root) {
    let min = Number.MAX_SAFE_INTEGER;
    let prev = null;
    
    function dfs(node){
        if(node == null){
            return;
        }
        
        dfs(node.right);
        
        if(prev != null){
            min = Math.min(prev - node.val, min);    
        }
                        
        prev = node.val;
        dfs(node.left);        
    }
    
    dfs(root);
    return min;    
};