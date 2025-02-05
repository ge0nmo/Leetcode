class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;        
        
        for(int i = 0; i < prices.length - 1; i++)
        {            
            int today = prices[i];
            int tomorrow = prices[i + 1];
            
            if(today < tomorrow)
                sum += tomorrow - today;            
            
        }
        
        return sum;
    }
}