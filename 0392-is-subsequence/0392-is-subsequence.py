class Solution(object):
    def isSubsequence(self, s, t):
        
        lastIndex = 0
        for word in s:
            
            index = t.find(word)
            
            if index == -1 or index < lastIndex:
                return False
            

            lastIndex = lastIndex - index
            t = t[index + 1:]
        
        return True