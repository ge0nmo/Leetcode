class Solution {
    public int maxProfit(int[] prices, int fee) {
        int bought = -1 * prices[0];
        int sold = 0;
        
        for(int price : prices){           
            sold = Math.max(sold, bought + price - fee); 
            bought = Math.max(bought, sold - price);                       
        }
        
        return sold;
    }
}