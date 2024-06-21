class Solution(object):
    def tribonacci(self, n):
        if n == 0:
            return 0
        
        if n == 1 or n == 2:
            return 1
        
        a, b, c, d = 0, 1, 1, 0
        
        for i in range(n - 2):
            d = a + b + c
            a, b, c = b, c, d
            
        return d
        
        