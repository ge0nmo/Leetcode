/**
 * @param {number[]} nums
 * @return {number}
 */
var lengthOfLIS = function(nums) {
    const length = nums.length;
    let max = 1;
    
    const dp = Array.from({ length : length }, () => 1);        
    
    for(let i = length - 1; i >= 0; i--){
        for(let j = i + 1; j < length; j++){
            if(nums[j] > nums[i]){
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            
        }
        max = Math.max(max, dp[i]);
        
    }
    
    return max;                
}