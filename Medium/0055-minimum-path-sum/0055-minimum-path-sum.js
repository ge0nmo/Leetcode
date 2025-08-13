/**
 * @param {number[][]} grid
 * @return {number}
 */
var minPathSum = function(grid) {
    const xLength = grid[0].length;
    const yLength = grid.length;

    for(let x = xLength - 1; x >= 0; x--){
        const nx = x + 1;
        for(let y = yLength - 1; y >= 0; y--){
            const ny = y + 1;

            if(nx < xLength && ny < yLength) grid[y][x] += Math.min(grid[ny][x], grid[y][nx]);

            else if(nx < xLength) grid[y][x] += grid[y][nx];

            else if(ny < yLength) grid[y][x] += grid[ny][x];

            else grid[y][x] = grid[y][x];
        }
    }

    return grid[0][0];
};

// 오른쪽 값이 length보다 크면 현재값 += 아래값
// 아래 값이 length보다 크면 현재값 += 오른쪽값
// 둘다 length보다 크면 현재값
// 둘다 length 범위 안이라면 가장 작은값 채택
// 00 01 02
// 10 11 12

// [1,2,3]
// [4,5,6]