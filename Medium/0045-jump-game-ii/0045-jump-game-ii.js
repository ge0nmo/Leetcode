/**
 * @param {number[]} nums
 * @return {number}
 */
var jump = function(nums) {
    let endPoint = 0;
    let maxDistance = 0;
    let jump = 0;
    
    for(let i = 0; i < nums.length - 1; i++){        
        maxDistance = Math.max(nums[i] + i, maxDistance);
        
        if(i === endPoint){
            jump++;
            endPoint = maxDistance;
        }
        
    }
    
    return jump;
    
};
