class Solution(object):
    def maxRepeating(self, sequence, word):
        count = 0;
        w = word;
        while w in sequence:
            count += 1;
            w += word;
            
        return count;