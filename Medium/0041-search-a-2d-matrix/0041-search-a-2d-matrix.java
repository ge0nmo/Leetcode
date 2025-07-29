class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return binarySearch(matrix, target);
        
    }

    public boolean binarySearch(int[][] matrix, int target)
    {        
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = m * n - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            
            int row = mid / n;
            int col = mid % n;
            
            int cur = matrix[row][col];

            if(cur == target) return true;

            else if(cur > target) right = mid - 1;

            else left = mid + 1;

        }
        
        return false;
    }
}


// 2차원이지만 1차원으로 취급
// matrix.length 세로의 길이
// matrix[n].length = 가로의 길이
// 3 x 4 배열에서 6은
// 