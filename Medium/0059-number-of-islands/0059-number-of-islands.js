/**
 * @param {character[][]} grid
 * @return {number}
 */
var numIslands = function(grid) {
    let count = 0;
    const dx = [-1, 0, 1, 0];
    const dy = [0, 1, 0, -1];

    const dfs = (grid, x, y) => {
        for(let i = 0; i < 4; i++){
            const nx = dx[i] + x;
            const ny = dy[i] + y;
            if(nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length && grid[nx][ny] === '1'){
                grid[nx][ny] = '0';
                dfs(grid, nx, ny);
            }
        }
    }

    for(let i = 0; i < grid.length; i++){
        for(let j = 0; j < grid[0].length; j++){
            if(grid[i][j] === '1'){
                dfs(grid, i, j);
                count += 1;
            }
        }
    }

    return count;
};