class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int lt = 0;
        int count = 0;
        int max = 0;
        
        for(int rt = 0; rt < answerKey.length(); rt++)
        {
            if(answerKey.charAt(rt) == 'F')
                count++;
            
            while(count > k)
            {
                if(answerKey.charAt(lt++) == 'F')
                    count--;
            }
            
            max = Math.max(max, rt - lt + 1);
        }
        
        count = 0;;
        lt = 0;
        for(int rt = 0; rt < answerKey.length(); rt++)
        {
            if(answerKey.charAt(rt) == 'T')
                count++;
            
            while(count > k)
            {
                if(answerKey.charAt(lt++) == 'T')
                    count--;
            }
            
            max = Math.max(max, rt - lt + 1);
        }
        
        return max;
    }
}