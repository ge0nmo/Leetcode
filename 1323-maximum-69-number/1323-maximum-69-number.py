class Solution(object):
    def maximum69Number (self, num):
        word = str(num)
        answer = ""
        isChanged = False
        for i in word:
            if i == '6' and not isChanged:
                i = '9'
                isChanged = True
            
            answer = answer + i
        
        return int(answer)