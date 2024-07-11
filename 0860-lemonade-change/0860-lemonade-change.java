class Solution {
    public boolean lemonadeChange(int[] bills) {
        int balance[] = new int[21];        
        
        for(int bill : bills){            
            int rest = bill - 5;            
            
            if(rest == 5){
                if(balance[rest] < 1)
                    return false;
                
                --balance[rest];
            } else if(rest == 15){
                if(balance[10] > 0 && balance[5] > 0){
                    --balance[10];
                    --balance[5];
                } else if(balance[5] > 2){
                    balance[5] -= 3;
                } else
                    return false;
                
            }
            
            balance[bill]++;
        }
        
        return true;
    }                    
}