class Solution(object):
    def twoSum(self, nums, target):
        map = dict()
        for i in range(0, len(nums)):
            map[nums[i]] = i

        for i in range(0, len(nums)):
            rest = target - nums[i]
            
            if map.get(rest) != None and map.get(rest) != i :
                return [i, map.get(rest)]
        
        return []
            