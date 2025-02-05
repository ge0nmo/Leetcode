class Solution(object):
    def getLongestSubsequence(self, words, groups):
        answer = []
        answer.append(words[0])
        
        for i in range(1, len(groups)):
            
            if groups[i - 1] != groups[i]:
                answer.append(words[i])
        
        
        return answer;
            
        