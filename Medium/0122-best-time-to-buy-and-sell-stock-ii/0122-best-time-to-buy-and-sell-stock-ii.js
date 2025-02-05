/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let sum = 0;
    
    for(let i = 0; i < prices.length - 1; i++){
        let today = prices[i];
        let tomorrow = prices[i + 1];
        
        if(today < tomorrow){
            sum += tomorrow - today;
        }
    }
    
    return sum;
};