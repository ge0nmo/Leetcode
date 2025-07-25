class Solution {
    static final int[] dx = {-1, 0, 1, 0};
    static final int[] dy = {0, 1, 0, -1};

    public boolean exist(char[][] board, String word) {
        if(!isAvailable(board, word)) return false;

        boolean[][] visited = new boolean[board.length][board[0].length];

        for(int x = 0; x < board.length; x++){
            for(int y = 0; y < board[0].length; y++){
                if(board[x][y] == word.charAt(0)){
                    if(backtrack(board, word, x, y, 0, visited)) return true;
                }
            }
        }

        return false;
    }

    public boolean backtrack(char[][] board, String word, int x, int y, int index, boolean[][] visited)
    {
        if(word.length() == index) return true;
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length) return false;
        if(visited[x][y]) return false;
        if(word.charAt(index) != board[x][y]) return false;

        visited[x][y] = true;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(backtrack(board, word, nx, ny, index + 1, visited)){
                return true;
            }
        }

        visited[x][y] = false;
        return false;
    }

    public boolean isAvailable(char[][] board, String word)
    {
        List<Character> list = new ArrayList();
        for(char[] row : board){
            for(char ch : row){
                list.add(ch);
            }
        }

        for(char ch : word.toCharArray()){
            if(!list.contains(ch)) return false;
        }

        return true;
    }
}