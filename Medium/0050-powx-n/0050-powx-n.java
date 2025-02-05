class Solution {
    public double myPow(double x, int n) {
        if(x == 0) return 0;
        if(x == 1) return x;
        
        if(n < 0){
            x = 1 / x;
            n = n * -1;
        }
            
        return solution(x, n);
    }
    
    public double solution(double x, int n){
        if(n == 0) return 1;
        
        double answer = solution(x, n / 2);
        if(n % 2 == 0){
            return answer * answer;
        } else{
            return answer * answer * x;
        }                
    }
}