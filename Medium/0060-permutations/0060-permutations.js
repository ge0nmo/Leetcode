/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var permute = function(nums) {
    const answer = [];
    const visited = new Array(nums.length).fill(false);
    backtrack(answer, [], nums, visited);
    return answer;
};

function backtrack(answer, cur, nums, visited){
    if(nums.length === cur.length){
        answer.push([...cur]);
        return;
    }

    for(let i = 0; i < nums.length; i++){
        if(visited[i]) continue;
        
        cur.push(nums[i]);
        visited[i] = true;
        backtrack(answer, cur, nums, visited);
        cur.pop();
        visited[i] = false;
    }

}