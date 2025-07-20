class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList();
        backtrack(answer, 0, 0, new StringBuilder(), n);
        return answer;
    }

    public void backtrack(List<String> answer, int open, int close, StringBuilder cur, int max)
    {
        if(cur.length() == max * 2){
            answer.add(cur.toString());
            return;
        }

        if(open < max){
            cur.append('(');
            backtrack(answer, open + 1, close, cur, max);
            cur.deleteCharAt(cur.length() - 1);
        }

        if(close < open){
            cur.append(')');
            backtrack(answer, open, close + 1, cur, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}