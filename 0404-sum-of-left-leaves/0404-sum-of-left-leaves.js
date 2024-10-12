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
var sumOfLeftLeaves = function(root) {
    if(root === null){
        return 0;
    }
        
    return sumLeftNodes(root, false);
};

var sumLeftNodes = function(root, isLeft){
    if(root === null){
        return 0;
    }
    
    if(root.left === null && root.right === null){
        if(isLeft){
            return root.val;
        }
    }
    
    return sumLeftNodes(root.left, true) + sumLeftNodes(root.right, false);    
}

