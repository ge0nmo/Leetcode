class Solution {
    public int longestSubarray(int[] nums) {
        
        int lt = 0;
        int count = 0;
        int max = 0;
        
        for(int rt = 0; rt < nums.length; rt++)
        {
            if(nums[rt] == 0)
                count++;
            
            
            while(count > 1)
            {
                if(nums[lt++] == 0)
                    count--;
                                
            }
            
            max = Math.max(max, rt - lt);
        }
        
        return max;
    }
}