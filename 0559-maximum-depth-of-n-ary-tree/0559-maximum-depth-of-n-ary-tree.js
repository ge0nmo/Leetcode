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
    
    const queue = [root];
    let depth = 0;
    
    while(queue.length > 0){
        const size = queue.length;
        
        for(let i = 0; i < size; i++){
            const cur = queue.shift();
            
            for(const child of cur.children){
                if(child != null){
                    queue.push(child);
                }
            }
        }
        
        depth++;
    }
    
    return depth;
};