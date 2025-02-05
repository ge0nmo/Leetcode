/**
 * @param {number} n
 * @return {string[]}
 */
var generateParenthesis = function(n) {
    const answer = [];
    let parenthesis = '';
    
    const backtracking = (open, close, str) => {
        if(str.length === n * 2){
            answer.push(str);
            return;
        }
        
        if(open < n){
            backtracking(open + 1, close, str + '(');            
        }
        
        if(close < open){
            backtracking(open, close + 1, str +')');            
        }
        
        return;
    }
    
    backtracking(0, 0, parenthesis);
    
    return answer;
};