class Solution(object):
    def numJewelsInStones(self, jewels, stones):
        count = 0
        
        jewels_set = set(jewels)
        
        for stone in stones:
            if stone in jewels_set:
                count += 1
        
        
        return count
        