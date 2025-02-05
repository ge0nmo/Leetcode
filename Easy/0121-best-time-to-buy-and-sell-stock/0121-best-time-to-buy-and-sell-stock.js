/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let lt = 0;
    let rt = 1;
    let max = 0;
    
    while(rt < prices.length){
        if(prices[rt] < prices[lt]){
            lt++;
            continue;
        }
        
        max = Math.max(prices[rt] - prices[lt], max);
        rt++;
    }
    
    return max;
};