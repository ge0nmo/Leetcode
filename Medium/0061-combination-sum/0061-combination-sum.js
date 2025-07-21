/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
var combinationSum = function(candidates, target) {
    const answer = [];
    const cur = [];

    function backtrack(candidates, target, index, answer, cur){
        if(target == 0){
            answer.push([...cur]);
            return;
        }

        if(target < 0) return;

        for(; index < candidates.length; index++){
            const candidate = candidates[index];
            cur.push(candidate);
            backtrack(candidates, target - candidate, index, answer, cur);
            cur.pop();
        }
    }

    backtrack(candidates, target, 0, answer, cur);
    return answer;
};