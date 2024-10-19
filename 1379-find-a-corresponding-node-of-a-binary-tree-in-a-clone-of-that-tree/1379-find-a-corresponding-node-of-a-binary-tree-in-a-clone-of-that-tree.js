/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} original
 * @param {TreeNode} cloned
 * @param {TreeNode} target
 * @return {TreeNode}
 */

var getTargetCopy = function(original, cloned, target) {
    
    const dfs = (original, cloned, target) => {
        if(original === null){
            return null;
        }        
        
        if(original.val === target.val){
            return cloned;
        }
        
        const left = dfs(original.left, cloned.left, target);
        const right = dfs(original.right, cloned.right, target);
        
        if(left !== null && left.val === target.val){
            return left;
        }
        
        if(right !== null && right.val === target.val){
            return right;
        }
        return null;
    }
    
    return dfs(original, cloned, target);
};