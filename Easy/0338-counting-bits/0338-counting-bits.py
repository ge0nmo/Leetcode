class Solution(object):
    def countBits(self, n):
        answer = []
        
        for i in range(0, n + 1):
            count = self.countOne(i)
            answer.append(count)
        
        return answer
    
    
    
    def countOne(self, n):
        count = 0
        while n >= 1:
            rest = n % 2
            
            n = n / 2
            
            if rest == 1:
                count += 1
            
        if n == 1:
            count += 1
            
        return count