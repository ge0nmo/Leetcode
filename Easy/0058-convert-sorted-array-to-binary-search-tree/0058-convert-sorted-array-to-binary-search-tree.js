/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {number[]} nums
 * @return {TreeNode}
 */
var sortedArrayToBST = function(nums) {
    if(nums.length === 0) return null;

    return dfs(nums, 0, nums.length - 1);
};

function dfs(nums, left, right){
    if(left > right) return null;

    const mid = Math.floor((left + right) / 2);

    const cur = new TreeNode(nums[mid]);
    cur.left = dfs(nums, left, mid - 1);
    cur.right = dfs(nums, mid + 1, right);
    
    return cur;
}