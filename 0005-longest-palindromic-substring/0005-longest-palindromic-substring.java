class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1){
            return "";
        }
        
        String max = "";
        for(int i = 0; i < s.length(); i++){
            
            String odd = isPalindrome(s, i, i);
            String even = isPalindrome(s, i, i + 1);
            
            if(odd.length() < even.length())
                odd = even;
            
            if(max.length() < odd.length()){
                max = odd;
            }
            
        }
        
        return max;        
    }
    
    
    public String isPalindrome(String s, int left, int right){
        boolean isPalindrome = false;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            --left;
            ++right;
            isPalindrome = true;
        }
        
        String answer = "";
        if(isPalindrome){
            answer = s.substring(left + 1, right);
        }
        
        return answer;        
    }
}

// palindrom을 찾는 메소드를 이용
// right - left가 1이나 0이라면 palindrome이 아니므로 pass

// babad
// 01234


