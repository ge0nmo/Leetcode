class Solution {
    public List<String> letterCombinations(String digits) {        
        List<String> answer = new ArrayList();
        if(digits.length() == 0) return answer;
        
        String[] strMap = new String[]{
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };

        backtrack(answer, digits, strMap, 0, new StringBuilder());
        return answer;
    }

    public void backtrack(List<String> answer, String digits, String[] strMap, int idx, StringBuilder sb)
    {
        if(idx == digits.length()){
            answer.add(sb.toString());
            return;
        }

        int digit = digits.charAt(idx) - '0';
        String letter = strMap[digit];

        for(char ch : letter.toCharArray()){
            sb.append(ch);
            backtrack(answer, digits, strMap, idx + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}

// store the alphabet in array
// a b c
// d e f
// w x y z