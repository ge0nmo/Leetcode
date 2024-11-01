/**
 * @param {number[]} nums
 * @return {boolean}
 */
var canJump = function(nums) {
    if(nums.length === 1){
        return true;
    } 
    if(nums[0] === 0){
        return false;
    }
    
    let maxJump = nums[0];
    let endPoint = nums[0];
    
    for(let i = 1; i < nums.length - 1; i++){
        maxJump = Math.max(maxJump, nums[i] + i);
        
        if(endPoint === i && nums[i] === 0){
            return false;
        }
        
        endPoint = maxJump;
    }
    
    return true;
};

// maxJump, endPoint 변수 할당
// nums 길이만큼 반복문
// 각 자리마다 max 점프를 계산
// 현재 위치가 endPoint인데 nums[i]가 0이라면 false 리턴
// 모든 반복문이 끝나면 true 리턴