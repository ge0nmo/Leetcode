class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        String str1 = solution(s);
        String str2 = solution(t);    
        
        return str1.equals(str2);
    }
    
    public String solution(String str)
    {
        StringBuilder sb = new StringBuilder();
        
        for(char ch : str.toCharArray())
        {
            if(ch != '#')
                sb.append(ch);
            
            else if(!sb.isEmpty())
            {
                sb.deleteCharAt(sb.length() - 1);
            }
            
        }
        
        return sb.toString();
    }
    
}