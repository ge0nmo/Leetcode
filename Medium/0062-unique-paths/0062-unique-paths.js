/**
 * @param {number} m
 * @param {number} n
 * @return {number}
 */
var uniquePaths = function(m, n) {
    const arr = Array.from({length : n + 1}, () => Array(m + 1).fill(0));
    
    arr[n][m - 1] = 1;
    
    for(let i = n - 1; i >= 0; i--){
        for(let j = m - 1; j >= 0; j--){            
            arr[i][j] = arr[i + 1][j] + arr[i][j + 1];
        }
    }
    
    return arr[0][0];
};