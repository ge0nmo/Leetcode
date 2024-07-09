class Solution(object):
    def maximumOddBinaryNumber(self, s):
        count = 0
        for i in range(0, len(s)):
            if s[i] == '1':
                count += 1;
        
        zero = len(s) - count
        answer = ""
        for i in range(0, count - 1):
            answer = answer + '1'
        
        for i in range(0, zero):
            answer = answer + '0'
        
        return answer + '1'
        