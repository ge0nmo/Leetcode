/**
 * @param {number} turnedOn
 * @return {string[]}
 */
var readBinaryWatch = function(turnedOn) {
    if(turnedOn >= 9){
        return [];
    }
    
    const answer = [];
    
    function formatting(h, m){
        let hValue = h.toString();  
        
        let mValue = m.toString();
        if(m < 10){
            mValue = `0${m}`;
        }
        
        return `${hValue}:${mValue}`;
    }
    
    function countOne(num){
        let count = 0;
        const value = num.toString(2);
        for(let i of value){
            if(i === '1'){
                count++;
            }
        }
        
        return count;
    }
    
    let length = 0;
    for(let h = 0; h < 12; h++){
        for(let m = 0; m < 60; m++){
            length = countOne(h) + countOne(m);
            
            if(length == turnedOn){
                const time = formatting(h, m);
                answer.push(time);
            }
            
        }
    }
    
    
    return answer;
};