class Solution {
    public List<Integer> getRow(int n) {
        int[] arr = new int[n + 1];
        
        arr[0] = 1;
                
        for(int i = 1; i <= n; i++)
        {
            for(int j = i; j > 0; j--)
            {
                arr[j] += arr[j - 1];
            }
        }
            
        List<Integer> answer = new ArrayList();
        for(int i = 0; i <= n; i++)
        {
            if(arr[i] == 0)
                break;
            
            answer.add(arr[i]);            
        }
        
        return answer;
    }
}
