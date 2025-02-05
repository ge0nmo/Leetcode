class Solution(object):
    def fib(self, n):
        if n == 0:
            return 0
        
        if n == 1:
            return 1            
        
        answer = [0, 1]
        
        for i in range(2, n + 1):
            answer.append(answer[-2] + answer[-1])
        
        return answer[-1]
        
        
# 0 1 1 2 3 5 