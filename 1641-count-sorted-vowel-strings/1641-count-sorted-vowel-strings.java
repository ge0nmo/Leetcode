class Solution {
    public int countVowelStrings(int n) {
        
        long res = 1;
        int num = n + 4;
        
        for(int i = 1; i <= 4; i++){
            res *= (num - (4 - i));
            res /= i;
        }
        
        return (int)res;
        
    }
}