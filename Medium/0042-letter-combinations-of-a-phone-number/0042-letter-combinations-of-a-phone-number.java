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

        backtrack(answer, digits, new StringBuilder(), 0, strMap);
        return answer;
    }

    public void backtrack(List<String> answer, String digits, StringBuilder current, int index, String[] strMap)
    {
        if(digits.length() == current.length()){
            answer.add(current.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = strMap[digit];

        for(char ch : letters.toCharArray()){
            current.append(ch);
            backtrack(answer, digits, current, index + 1, strMap);
            current.deleteCharAt(current.length() - 1);
        }
        
    }

    


}

// a 에서 루프 돌리기
// 