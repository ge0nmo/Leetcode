class Solution(object):
    def numJewelsInStones(self, jewels, stones):
        count = 0
        
        for i in range(len(stones)):
            if jewels.find(stones[i]) != -1:
                count += 1
        
        
        return count
        