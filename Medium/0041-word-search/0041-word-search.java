class Solution {
    final int[] dx = {-1, 0, 1, 0};
    final int[] dy = {0, 1, 0, -1};

    public boolean exist(char[][] board, String word) {
        if(!wordAvailable(board, word)) return false;

        boolean[][] visited = new boolean[board.length][board[0].length];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
               if(board[i][j] == word.charAt(0)){
                  if(backtrack(board, word, i, j, 0, visited)){
                    return true;
                  }
               }
            }
        }
        return false;
    }

    public boolean backtrack(char[][] board, String word, int row, int col, int idx, boolean[][] visited){        
        if(idx == word.length()) return true;
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length) return false;
        if(visited[row][col]) return false;
        if(board[row][col] != word.charAt(idx)) return false;

        visited[row][col] = true;

        for(int i = 0; i < 4; i++){
            int nx = row + dx[i];
            int ny = col + dy[i];
            
            if(backtrack(board, word, nx, ny, idx + 1, visited)) return true;

        }

        visited[row][col] = false;
        return false;
    }

    public boolean wordAvailable(char[][] board, String word)
    {
        Map<Character, Integer> map = new HashMap<>();
        for(char[] row : board){
            for(char ch : row){
                map.put(ch, 1);
            }
        }

        for(char ch : word.toCharArray()){
            if(!map.containsKey(ch)) return false;
        }
        return true;
    }
}

// 0, 0 부터 시작해서 하나씩 돌기
// 0번째 인덱스에 있는 글자와 다르다면 리턴
