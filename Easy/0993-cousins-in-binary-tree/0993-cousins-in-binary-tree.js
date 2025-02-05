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
 * @param {number} x
 * @param {number} y
 * @return {boolean}
 */
var isCousins = function(root, x, y) {
    let depth = 0;
    const map = new Map();
    
    function dfs(node, x, y, parent, depth, map){
        if(node === null){
            return false;
        }
        
        if(node.val === x || node.val === y){
            map.set(node.val, [parent, depth]);
        }
        
        if(map.get(x) !== undefined && map.get(y) !== undefined){
            const xArray = map.get(x);
            const yArray = map.get(y);
            
            
            if(xArray[0] !== yArray[0] && xArray[1] === yArray[1]){
                return true;
            }
        }
        
        return dfs(node.left, x, y, node.val, depth + 1, map) || dfs(node.right, x, y, node.val, depth + 1, map);
    }
    
    return dfs(root, x, y, 0, 0, new Map());
    
};