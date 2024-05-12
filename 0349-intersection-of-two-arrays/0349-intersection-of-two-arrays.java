import java.util.*;


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set = new HashSet();
        
        int lt = 0;
        int rt = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        while(lt < nums1.length && rt < nums2.length)
        {
            if(nums1[lt] == nums2[rt])
            {
                set.add(nums1[lt]);
                lt++;
                rt++;
            }
            
            else if (nums1[lt] > nums2[rt])
                rt++;
            
            else if (nums1[lt] < nums2[rt])
                lt++;            
        }
        
        int[] answer = new int[set.size()];
        
        Iterator<Integer> iterator = set.iterator();
        
        int i = 0;
        while(iterator.hasNext())
        {
            answer[i] = iterator.next();
            i++;
        }
        
        return answer;
    }
}