/**
 * @param {number[][]} grid
 * @return {number}
 */
var minPathSum = function(grid) {
    
    for(let i = grid.length - 1; i >= 0; i--){
        for(let j = grid[0].length - 1; j >= 0; j--){
            if(i === grid.length - 1 && j === grid[0].length - 1){
                continue;
            }
            
            let right = Infinity;
            let bottom = Infinity;
            
            if(i + 1 < grid.length){
                right = grid[i + 1][j];
            }
            
            if(j + 1 < grid[0].length){
                bottom = grid[i][j + 1];
            }
            
            grid[i][j] += Math.min(right, bottom);
            
        }
    }
    
    return grid[0][0];
};

// 배열을 복사
// 배열의 맨 아래 오른쪽 부분부터 시작
// 왼쪽으로 이동 -> 위로 이동
// 오른쪽, 아래 중 작은 수를 더하면서 이동



