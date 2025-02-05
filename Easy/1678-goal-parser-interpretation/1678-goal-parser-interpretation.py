class Solution(object):
    def interpret(self, command):
        # return command.replace('()', 'o').replace('(al)', 'al')
        
        answer = ''
        for i in range(len(command)):
            if command[i] == 'G':
                answer += 'G'
            
            elif command[i] == '(':
                if command[i + 1] == ')':
                    answer += 'o'
                else:
                    answer += 'al'
            
        
        return answer
        