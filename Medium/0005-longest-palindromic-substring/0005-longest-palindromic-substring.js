/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
    if(s === null || s.length < 1){
        return '';
    }
    
    let max = '';
    for(let i = 0; i < s.length; i++){
        
        let left = getPalindrome(i, i);
        let right = getPalindrome(i, i + 1);
        
        if(left.length < right.length ){
            left = right;
        }
        
        if(max.length < left.length){
            max = left;
        }
    }
        
    
    function getPalindrome(left, right){
        while(left >= 0 && right < s.length && s.charAt(left) === s.charAt(right)){
            --left;
            ++right;
        }
        
        return s.substring(left + 1, right);
    }
    
    return max;
};