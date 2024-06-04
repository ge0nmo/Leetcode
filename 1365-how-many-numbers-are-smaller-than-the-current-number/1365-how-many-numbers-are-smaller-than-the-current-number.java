class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap();
        
        int[] answer = new int[length];
        for(int i = 0; i < length; i++)
        {
            int count = 0;
            int key = nums[i];
            if(!map.containsKey(key))
            {
                for(int j = 0; j < length; j++)
                {
                    if(key > nums[j])
                    {
                        count++;
                    }
                }
                
                answer[i] = count;
                map.put(key, count);
                
            }
            else
            {
                answer[i] = map.get(key);
            }
                            
            
        }
        
        return answer;
    }
}