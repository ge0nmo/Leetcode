class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        int n = name.length();
        int m = typed.length();
        
        while(j < m)
        {
            if(i < n && name.charAt(i) == typed.charAt(j))
            {
                ++i;
                ++j;
            }
            
            else if(j > 0 && typed.charAt(j) == typed.charAt(j - 1))
                ++j;
            
            else
                return false;            
        }
        
        return i == n;
        
    }
}