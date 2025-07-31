/**
 * @param {number[]} nums
 * @return {number}
 */
var findMin = function(nums) {
    let left = 0;
    let right = nums.length - 1;

    while(left < right){
        const mid = Math.floor((left + right) / 2);

        if(nums[mid] < nums[right]) right = mid;
        else left = mid + 1;
    }

    return nums[left];
};

// mid가 right 값보다 작다면 정렬이 안된 것이기 때문에 right = mid
// mid가 right 값보다 크다면 정렬이 된 것이기 때문에 left = mid + 1;