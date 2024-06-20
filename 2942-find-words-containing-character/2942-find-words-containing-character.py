class Solution(object):
    def findWordsContaining(self, words, x):        
        answer = []
        
        for i in range(len(words)):
            if x in words[i]:
                answer.append(i)
        
        return answer
        