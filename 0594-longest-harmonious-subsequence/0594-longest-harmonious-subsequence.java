class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        
        int lt = 0;
        int length = 0;
        int max = 0;
        
        for(int rt = 1; rt < nums.length; rt++)
        {
            while(nums[rt] - nums[lt] > 1)
            {
                lt++;
            }
            
            if(nums[rt] - nums[lt] == 1)
            {
                length = rt - lt + 1;
                max = Math.max(length, max);
            }
            
                
        }
        
        return max;
    }
}