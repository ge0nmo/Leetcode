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


var getMinimumDifference = function(root) {
    let min = Number.MAX_VALUE;
    let prev = null;
    
    const recursive = (root) => {
        if(root === null){
            return null;
        }
        
        recursive(root.left);
        
        if(prev != null){
            min = Math.min(min, root.val - prev);
        }
        
        prev = root.val;
        
        recursive(root.right);
        return min;
    }
    
    recursive(root);
    
    return min;
};