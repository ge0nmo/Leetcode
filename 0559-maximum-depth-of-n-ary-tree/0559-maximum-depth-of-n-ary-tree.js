/**
 * // Definition for a _Node.
 * function _Node(val,children) {
 *    this.val = val;
 *    this.children = children;
 * };
 */

/**
 * @param {_Node|null} root
 * @return {number}
 */
var maxDepth = function(root) {
    if(root === null){
        return 0;
    }
    
    function recursive(node, depth){
        if(node === null){
            return depth;
        }
        
        let max = depth;
        for(const child of node.children){
            max = Math.max(recursive(child, depth + 1), max);
        }
        
        return max;
    }
    
    return recursive(root, 1);
};