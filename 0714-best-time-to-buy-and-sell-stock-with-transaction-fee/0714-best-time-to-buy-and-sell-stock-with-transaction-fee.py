class Solution(object):
    def maxProfit(self, prices, fee):
        buy = -1 * prices[0]
        sell = 0
        
        for price in prices:
            sell = max(sell, buy + price - fee)
            buy = max(buy, sell - price)            
            
        
        return sell
        