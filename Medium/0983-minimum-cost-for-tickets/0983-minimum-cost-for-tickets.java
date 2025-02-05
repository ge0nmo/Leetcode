class Solution {
    public int mincostTickets(int[] days, int[] costs) {                
        HashMap<Integer, Integer> map = new HashMap();
        map.put(costs[0], 1);
        map.put(costs[1], 7);
        map.put(costs[2], 30);
        
        Integer[] memo = new Integer[days.length];
        
        return mincostTickets(days, costs, 0, -1, map, memo);
    }
    
    public int mincostTickets(int[] days, int[] costs, int index, int expire, HashMap<Integer, Integer> map, Integer[] memo) {                
        if(index >= days.length)
            return 0;
                
        if(days[index] <= expire)
            return mincostTickets(days, costs, index + 1, expire, map, memo);         
        
        if(memo[index] != null)
            return memo[index];
        
        int min = Integer.MAX_VALUE;
                
        for(int cost : costs)
        {                                              
            int newExpiredAt = days[index] + map.get(cost) - 1;
            int result = mincostTickets(days, costs, index + 1, newExpiredAt, map, memo) + cost;                           
            
            min = Math.min(min, result);
        }
        
        memo[index] = min;
        return min;        
    }
}

