/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
    return binarySearch(matrix, target);
};

function binarySearch(matrix, target){
    const m = matrix.length;
    const n = matrix[0].length;

    let left = 0;
    let right = m * n - 1;
    
    while(left <= right){
        const mid = Math.floor((left + right) / 2);        
        const row = Math.floor(mid / n);
        const col = mid % n;
        const num = matrix[row][col];

        if(num === target) return true;
        else if(num > target) right = mid - 1;
        else left = mid + 1;        
    }
    return false;
}

// 0,0 0,1 0,2 0,3 1,0 1,1 1,2 1,3 2,0 2,1 2,2 2,3
//  0   1   2   3   4   5   6   7   8   9   10  11