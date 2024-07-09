class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == '1')
                ++count;
        }
     
        int zero = s.length() - count;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < count - 1; i++)
        {
            sb.append(1);
        }
        
        for(int i = 0; i < zero; i++)
        {
            sb.append(0);
        }
        
        return sb.append(1).toString();
        
    }    
}

// count the number of 1
// 