class Solution(object):
    def minCostClimbingStairs(self, cost):
        memo = [None] * len(cost)
        
        return min(self.solution(cost, 0, memo), self.solution(cost, 1, memo))
        
        
    
    
    def solution(self, cost, index, memo):
        if index >= len(cost):
            return 0
        
        if memo[index] is not None:
            return memo[index]
        
        step1 = self.solution(cost, index + 1, memo)
        step2 = self.solution(cost, index + 2, memo)
        
        m = min(step1, step2) + cost[index]
        memo[index] = m
        
        return m
        
        
        
