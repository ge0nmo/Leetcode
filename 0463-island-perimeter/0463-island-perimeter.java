class Solution {
        
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    
    public int islandPerimeter(int[][] grid) {
        if(grid == null || grid.length == 0)
            return 0;
        
        int x = grid.length;
        int y = grid[0].length;

        int sum = 0;
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                sum += dfs(i, j, grid);
            }            
        }
        
        
        return sum;
    }
    
    public int dfs(int x, int y, int[][] grid)
    {        
        if(grid[x][y] != 1){
            return 0;
        }
        
        int count = 4;        
        
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length){
                if(grid[nx][ny] != 0){
                    --count;
                }
            }
            
        }
        
        return count;
    }
    
}

//