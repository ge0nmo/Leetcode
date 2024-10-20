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
 * @return {string[]}
 */
var binaryTreePaths = function(root) {
    const answer = [];
    
    if(root === null){
        return answer;
    }
    
    function dfs(node, str){
        if(node.left === null && node.right === null){
            answer.push(str);
        }
        
        if(node.left !== null){
            let left = `${str}->${node.left.val}`;
            dfs(node.left, left);        
        }
        
        if(node.right !== null){
            let right = `${str}->${node.right.val}`;
            dfs(node.right, right);        
        }
    }
    
    dfs(root, (root.val).toString());
    
    return answer;
};