/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var subsets = function(nums) {
    const answer = [];
    backtrack(answer, [], nums, 0);
    return answer;
};

function backtrack(answer, cur, nums, index){
    answer.push([...cur]);

    for(index; index < nums.length; index++){
        cur.push(nums[index]);
        backtrack(answer, cur, nums, index + 1);
        cur.pop();
    }
}