class Solution(object):
    def fib(self, n):
        a = 0
        b = 1
        c = 1
        if n == 0:
            return 0
        
        if n == 1:
            return 1            
        
        for i in range(2, n):
            c = a + b
            a = b
            b = c
            
        
        return a + b
        
        
# 0 1 1 2 3 5 