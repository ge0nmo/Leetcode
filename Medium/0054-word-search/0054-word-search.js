/**
 * @param {character[][]} board
 * @param {string} word
 * @return {boolean}
 */
var exist = function(board, word) {
    if(!wordAvailable(board, word)) return false;

    const visited = [];
    for(let x = 0; x < board.length; x++){
        const row = [];
        for(let y = 0; y < board[0].length; y++){
            row.push(false);
        }
        visited.push(row);
    }

    for(let x = 0; x < board.length; x++){
        for(let y = 0; y < board[0].length; y++){
            if(board[x][y] === word.charAt(0)){
                if(backtrack(board, word, x, y, 0, visited)) return true;
            }
        }
    }

    return false;
};

const dx = [1, 0, -1, 0];
const dy = [0, 1, 0, -1];

function backtrack(board, word, x, y, index, visited){
    if(index === word.length) return true;
    if(x < 0 || x >= board.length || y < 0 || y >= board[0].length) return false;
    if(visited[x][y]) return false;
    if(board[x][y] !== word.charAt(index)) return false;
    
    visited[x][y] = true;

    for(let i = 0; i < 4; i++){
        const nx = x + dx[i];
        const ny = y + dy[i];
        if(backtrack(board, word, nx, ny, index + 1, visited)) return true;    
    }

    visited[x][y] = false;
    return false;
}

function wordAvailable(board, word){
    const arr = [];
    for(const row of board){
        for(const ch of row){
            arr.push(ch);
        }
    }

    for(const ch of word){
        if(!arr.includes(ch)) return false;
    }
    return true;
}