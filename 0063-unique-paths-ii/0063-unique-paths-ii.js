/**
 * @param {number[][]} obstacleGrid
 * @return {number}
 */
var uniquePathsWithObstacles = function(obstacleGrid) {
    const row = obstacleGrid.length;
    const col = obstacleGrid[0].length;
    
    const dp = Array.from({ length: row }, () => Array(col).fill(0));
    
    dp[row - 1][col - 1] = 1;
    
    for(let i = row - 1; i >= 0; i--){
        for(let j = col - 1; j >= 0; j--){
            if(obstacleGrid[i][j] === 1){
                dp[i][j] = 0;
            } else{
                let right = 0;
                let bottom = 0;
                
                if(j + 1 < col){
                    right = dp[i][j + 1];
                }
                if(i + 1 < row){
                    bottom = dp[i + 1][j];
                }
                
                dp[i][j] += right + bottom;
            }
            

        }                
    }
    
    console.log(dp);
    return dp[0][0];    
};