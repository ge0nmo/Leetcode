class Solution(object):
    def getRow(self, rowIndex):                        
            if rowIndex == 0:
                return [1]
            
            elif rowIndex == 1:
                return [1, 1]
            
            answer = []
            answer.append([1])
            answer.append([1, 1])            
                                    
            for i in range(2, rowIndex + 1):
                subList = [1]                
                prev = answer[-1]
                
                for j in range(1, i):
                    n = prev[j] + prev[j -1]
                    subList.append(n)
                    
                subList.append(1)
                answer.append(subList)
            
            return answer[-1]
            
        
        
        
        