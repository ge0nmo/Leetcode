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
 * @param {number} k
 * @return {number}
 */
var kthSmallest = function(root, k) {
    let answer = 0;
    const dfs = (node) => {
        if(!node || k == 0) return;

        dfs(node.left, k);

        k--;
        if(k == 0) {
            answer = node.val;
            return;
        }
        
        dfs(node.right, k);
    }

    dfs(root);

    return answer;
};