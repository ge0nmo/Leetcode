class Solution {
    public int countSubstrings(String s) {
        
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            count += isPalindrome(s, i, i);
            count += isPalindrome(s, i, i + 1);
        }
        
        return count;
        
    }
    
    public int isPalindrome(String s, int left, int right)
    {
        int count = 0;
        while(left >= 0 && right <= s.length() - 1)
        {
            if(s.charAt(left) != s.charAt(right))
                return count;
            
            ++count;
            --left;
            ++right;
        }
        
        return count;
    }
}

// a a b a a
// a, a, b, a, a, aa, aba, aa, aabaa


