class Solution(object):
    def minCostClimbingStairs(self, cost):
        step = [0, 0]
        
        for i in range(2, len(cost) + 1):
            n = min(step[-1] + cost[i - 1], step[-2] + cost[i - 2])
            step.append(n)
            
        return step[-1]
