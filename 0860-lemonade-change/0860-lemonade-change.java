class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> map = new HashMap();
        map.put(5, 0);
        map.put(10, 0);
        map.put(20, 0);
        
        for(int bill : bills){            
            int rest = bill - 5;
            System.out.println(map.toString());
            
            if(rest == 5){
                if(map.get(rest) < 1)
                    return false;
                
                map.put(5, map.get(5) - 1);
            } else if(rest == 15){
                if(map.get(10) > 0 && map.get(5) > 0){
                    map.put(10, map.get(10) - 1);
                    map.put(5, map.get(5) - 1);
                } else if(map.get(5) > 2){
                    map.put(5, map.get(5) - 3);
                } else
                    return false;                
            }                        
            
            map.put(bill, map.get(bill) + 1);
            
        }
        
        return true;
    }                    
}