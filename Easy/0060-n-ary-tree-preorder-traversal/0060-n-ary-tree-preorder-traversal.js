/**
 * // Definition for a _Node.
 * function _Node(val, children) {
 *    this.val = val;
 *    this.children = children;
 * };
 */

/**
 * @param {_Node|null} root
 * @return {number[]}
 */
var preorder = function(root) {
    if(root == null) return [];

    const answer = [];
    const stack = [root];

    while(stack.length){
        const node = stack.pop();
        answer.push(node.val);

        for(let i = node.children.length - 1; i >= 0; i--){
            stack.push(node.children[i]);
        }
    }
    return answer;
};