/**
 * // Definition for a _Node.
 * function _Node(val,children) {
 *    this.val = val;
 *    this.children = children;
 * };
 */

/**
 * @param {_Node|null} root
 * @return {number[]}
 */
var postorder = function(root) {
    if(root == null) return [];

    const stack = [root];
    const answer = [];
    const set = new Set();

    while(stack.length){
        const node = stack.pop();
        
        if(node.children.length == 0 || set.has(node)) {
            answer.push(node.val);        
            continue;
        }
        stack.push(node);
        set.add(node);
        for(let i = node.children.length - 1; i >= 0; i--){
            stack.push(node.children[i]);
        }

    }

    return answer;
};

// =>?
// 1 4 2 3 6 5