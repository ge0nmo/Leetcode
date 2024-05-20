class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> sStack = solution(s);
        Stack<Character> tStack = solution(t);    
        
        return sStack.equals(tStack);
    }
    
    public Stack<Character> solution(String str)
    {
        Stack<Character> stack = new Stack();
        
        for(char ch : str.toCharArray())
        {
            if(ch != '#')
                stack.push(ch);
            
            else if(!stack.isEmpty())
            {
                stack.pop();
            }
            
        }
        
        return stack;
    }
    
}