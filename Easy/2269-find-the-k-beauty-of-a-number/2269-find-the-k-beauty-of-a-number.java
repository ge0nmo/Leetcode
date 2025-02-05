class Solution {
    public int divisorSubstrings(int num, int k) {
        
        int count = 0;
        String str = String.valueOf(num);
        String word = "";
        
        for(int i = 0; i < str.length(); i++)
        {
            word += str.charAt(i);
            
            if(word.length() > k)
            {
                word = word.substring(1);      
            }
            
            if(word.length() == k)
            {
                
                if(Integer.parseInt(word) != 0 && num % Integer.parseInt(word) == 0)
                    count++;                
            }
              
        }
        
        return count;
        
    }

}