class Solution(object):
    def isValid(self, s):
        stack = []
        
        for c in s:
            if c == '(':
                stack.append(')')
            
            elif c == '[':
                stack.append(']')
            
            elif c == '{':
                stack.append('}')
                
            elif not stack or c != stack.pop():
                return False
            
        
        return not stack
            
                