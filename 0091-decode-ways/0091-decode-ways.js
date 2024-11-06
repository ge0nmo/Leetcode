/**
 * @param {string} s
 * @return {number}
 */
var numDecodings = function(s) {
    if(s.length === 0 || s.charAt(0) === '0') return 0;
    
    if(s.length === 1) return 1;
    
    let count1 = 1;
    let count2 = 1;
    
    for(let i = 1; i < s.length; i++){
        const d = Number(s.charAt(i));
        const dd = (Number(s.charAt(i - 1)) * 10) + d;
        let count = 0;
        if(d > 0) count += count2;
        
        if(dd >= 10 && dd <= 26) count += count1;
        
        count1 = count2;
        count2 = count;
        
    }
    
    return count2
};

// 1 2 2 3 4


// 1 2
// 1 2

