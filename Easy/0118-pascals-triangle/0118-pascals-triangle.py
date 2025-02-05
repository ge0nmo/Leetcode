class Solution(object):
    def generate(self, numRows):
        answer = []
        
        answer.append([1])        
        for i in range(1, numRows):
            sub = []
            prev = answer[i - 1]
            
            sub.append(1)
            for j in range(0, len(prev) - 1):
                n = prev[j] + prev[j + 1]
                sub.append(n)
                
            sub.append(1)
            answer.append(sub)
        
        return answer