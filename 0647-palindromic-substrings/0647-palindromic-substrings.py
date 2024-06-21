class Solution(object):   
    def countSubstrings(self, s):
        count = 0
        for c in range(len(s)):            
            count += self.isPalinedrome(s, c, c)                               
            count += self.isPalinedrome(s, c, c + 1)

        return count
    
    def isPalinedrome(self, s, left, right):
        count = 0
        while left >= 0 and right <= len(s) - 1:
            if s[left] != s[right]:
                return count;
            
            count += 1
            left -= 1
            right += 1
            
        return count;
    
    
    
            
        
        