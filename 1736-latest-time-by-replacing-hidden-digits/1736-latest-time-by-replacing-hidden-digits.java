class Solution {
    public String maximumTime(String time) {
        String[] arr = time.split(":");
        String hour = arr[0];
        String min = arr[1];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < 2; i++)
        {
            char ch = hour.charAt(i);
            if(ch == '?' && i == 0)
            {
                char n = hour.charAt(1);
                if(n == '?')
                    sb.append(2);
                
                else if(n - 48 > 3)
                    sb.append(1);
                
                else
                    sb.append(2);
                
            }
            else if(ch == '?' && i == 1)
            {
                char n = hour.charAt(0);                                
                if(n == '2' || n == '?')
                    sb.append(3);
                else
                    sb.append(9);                    
                    
            }
            else
                sb.append(ch);            
        }
        sb.append(':');
        
        for(int i = 0; i < 2; i++)
        {
            char ch = min.charAt(i);
            
            if(ch == '?' && i == 0)
            {
                sb.append(5);
            }
            else if(ch == '?' && i == 1)
            {
                sb.append(9);
            }
            else            
                sb.append(ch);
                        
        }
        
        
        
        return sb.toString();
    }
}

// hour             min
// 1st     2nd      1st     2nd
//  2       3       5       9
//  1       9       5       9
//  0       9       5       9
//  ?       ?
// 23