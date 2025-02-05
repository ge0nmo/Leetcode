class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int answer = 0;
        int arr[] = new int[101];
        for(int i = 0; i < nums.length; i++)
        {

            answer += arr[nums[i]]++;
        }
        
        return answer;
    }
}