class Solution {
    public int numberOfSubstrings(String s) {   
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        int lt = 0;
        
        for (int rt = 0; rt < s.length(); rt++) 
        {
            char right = s.charAt(rt);
            map.put(right, map.getOrDefault(right, 0) + 1);
            
            while (map.size() == 3) 
            {
                char left = s.charAt(lt);
                
                map.put(left, map.get(left) - 1);
                if (map.get(left) == 0) 
                    map.remove(left);
                
                
                count += s.length() - rt;
                lt++;
            }
        }
        
        return count;
    }
}