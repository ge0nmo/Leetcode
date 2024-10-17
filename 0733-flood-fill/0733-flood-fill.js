/**
 * @param {number[][]} image
 * @param {number} sr
 * @param {number} sc
 * @param {number} color
 * @return {number[][]}
 */
var floodFill = function(image, sr, sc, color) {
    const original = image[sr][sc];
    if(original === color){
        return image;
    }
    
    image[sr][sc] = color;
    const queue = [[sr, sc]];
    const dx = [-1, 0, 1, 0];
    const dy = [0, -1, 0, 1];
    
    while(queue.length > 0){
        const cur = queue.shift();
        let x = cur[0];
        let y = cur[1];
        
        for(let i = 0; i < 4; i++){
            let nx = x + dx[i];
            let ny = y + dy[i];
            
            if(nx >= 0 && nx < image.length && ny >= 0 && ny < image[0].length && image[nx][ny] == original){
                image[nx][ny] = color;
                queue.push([nx, ny]);
            }
        }
        
    }
    return image;
    
};