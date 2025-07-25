class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> answer = new ArrayList<>();
        backtrack(s, answer, new ArrayList<>(), 0);
        return answer;
    }

    public void backtrack(String s, List<List<String>> answer, List<String> cur, int start)
    {
        if(start == s.length()){
            answer.add(new ArrayList(cur));
            return;
        }

        for(int end = start; end < s.length(); end++){
            if(isPalindrome(s, start, end)){
                cur.add(s.substring(start, end + 1));
                backtrack(s, answer, cur, end + 1);
                cur.remove(cur.size() - 1);
            }
            
        }
    }

    public boolean isPalindrome(String s, int left, int right)
    {
        while(left < right){
            if(s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

}