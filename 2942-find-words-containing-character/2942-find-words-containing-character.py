class Solution(object):
    def findWordsContaining(self, words, x):        
        answer = []
        
        s = 0
        for word in words:
            if x in word:
                answer.append(s)
            s += 1
        
        return answer
        
        