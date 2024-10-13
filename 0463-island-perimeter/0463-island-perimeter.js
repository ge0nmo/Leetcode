/**
 * @param {number[][]} grid
 * @return {number}
 */

var islandPerimeter = function(grid) {
    if(grid === null || grid.length === 0){
        return 0;
    }
    
    let sum = 0;
    for(let x = 0; x < grid.length; x++){
        for(let y = 0; y < grid[0].length; y++){
            sum += checkLand(x, y, grid);            
        }
    }
    
    return sum;
};


const checkLand = function(x, y, grid){
    if(grid[x][y] != 1){
        return 0;
    }
    
    const dx = [-1, 0, 1, 0];
    const dy = [0, 1, 0, -1];
    let nx = 0;
    let ny = 0;
    let count = 4;
    for(let i = 0; i < 4; i++){
        nx = x + dx[i];
        ny = y + dy[i];        
        if(nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length){
            if(grid[nx][ny] != 0){
                --count;
            }
        }
    }
    
    return count;
}