class Solution {
    
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {                
        int original = image[sr][sc];
        
        if(original == color){
            return image;
        }
        
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        boolean[][] isVisited = new boolean[image.length][image[0].length];
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr, sc});
        
        
        image[sr][sc] = color;
        isVisited[sr][sc] = true;
        
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            
            for(int i = 0; i < 4; i++){
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                
                if(nx >= 0 && nx < image.length && ny >= 0 && ny < image[0].length && !isVisited[nx][ny]){
                    isVisited[nx][ny] = true;
                    if(image[nx][ny] == original){
                        image[nx][ny] = color;
                        queue.offer(new int[]{nx, ny});
                        
                    }                    
                }
                
            }
                        
        }
        
        return image;
        
    }
}