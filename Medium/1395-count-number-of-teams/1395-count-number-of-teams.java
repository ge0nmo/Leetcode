class Solution {
    public int numTeams(int[] rating) {
        int length = rating.length;
        int count = 0;
        for(int i = 0; i < length - 2; i++)
        {            
            for(int j = i + 1; j < length - 1; j++)
            {
                for(int k = j + 1; k < length; k++)
                {
                    int a = rating[i];
                    int b = rating[j];
                    int c = rating[k];
                    
                    if((a > b && b > c) || (a < b && b < c)) 
                        ++count;                    
                }
            }
        }
        
        return count;
    }
}

// 3