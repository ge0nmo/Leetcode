class Solution(object):
    def reversePrefix(self, word, ch):
        index = word.find(ch)
        
        if index == -1:
            return word
        
        prefix = word[:index+1]
        return prefix[::-1] + word[index + 1:]