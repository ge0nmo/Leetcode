class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        int[] clone = nums.clone();
        Arrays.sort(clone);
        Map<Integer, Integer> map = new HashMap();
        
        int[] answer = new int[length];
        for(int i = 0; i < length; i++)
        {
            map.putIfAbsent(clone[i], i);
        }
        
        for(int i = 0; i < length; i++)
        {
            answer[i] = map.get(nums[i]);
        }
        
        
        return answer;
    }
}