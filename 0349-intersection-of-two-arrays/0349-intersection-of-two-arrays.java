import java.util.*;


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set = new HashSet();
        
        Set<Integer> duplication = new HashSet();
        
        for(int i = 0; i < nums1.length; i++)
        {
            set.add(nums1[i]);
        }
        
        for(int i = 0; i < nums2.length; i++)
        {
            if(set.contains(nums2[i]))
                duplication.add(nums2[i]);
            
        }
        
        
        int[] answer = new int[duplication.size()];
        
        int i = 0;
        for(Integer n : duplication)
        {
            answer[i] = n;
            i++;
        }
        return answer;
        
    }
}