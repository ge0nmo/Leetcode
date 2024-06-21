class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2)
            return 1;
        
        int[] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] = 1;
        
        for(int i = 3; i <= n; i++)        
        {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        
        return arr[n];
    }
}

// n + 1 개의 배열을 생성
// 아래 모든 수를 더하는 것이지만
// 이전 배열이 모든 숫자를 더한 것의 합이기 때문에
// 