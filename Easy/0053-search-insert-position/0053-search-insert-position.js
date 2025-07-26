/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    return binarySearch(nums, target, 0, nums.length - 1);
};

function binarySearch(nums, target, left, right){
    let possiblePosition;

    while(left <= right){
        let mid = Math.floor((right + left) / 2);

        if(nums[mid] === target){
            return mid;
        } else if(nums[mid] > target){
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    return left;
}