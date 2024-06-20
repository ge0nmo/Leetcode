class Solution(object):
    def reversePrefix(self, word, ch):
        if ch not in word:
            return word
        
        index = word.index(ch)
        first = word[0 : index + 1][::-1]
        last = word[index + 1:]
        
        return first + last