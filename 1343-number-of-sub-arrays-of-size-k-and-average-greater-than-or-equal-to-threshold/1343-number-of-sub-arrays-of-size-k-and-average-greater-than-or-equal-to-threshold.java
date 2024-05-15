import java.util.*;

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {        
        
        int count = 0;
        int sum = 0;
        int lt = 0;
        for(int i = 0; i < k; i++)
        {
            sum += arr[i];
        }                
        
        if(sum / k >= threshold)
            count++;        
            
        for(int rt = k; rt < arr.length; rt++)
        {
            sum = sum - arr[lt++] + arr[rt];
            
            if((sum / k) >= threshold)
                count++;
                        
        }
        
        return count;
    }
}