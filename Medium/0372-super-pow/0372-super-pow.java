class Solution {
    public static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        a = a % MOD;
        if ( a == 0 ) return 0;
        int result = 1;
        for(int digit : b){
            result = (pow(result, 10) * pow(a, digit)) % MOD;
        }

        return result;
    }

    public int pow(int a, int digit)
    {        
        int result = 1;
        result = result % MOD;

        while(digit > 0){
            if(digit % 2 == 1){
                result = (result * a) % MOD;
            }
            digit >>= 1;
            a = (a * a) % MOD; 
        }

        return result;
    }
}
