class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        
        int max = Math.max(solution(answerKey, k, 'T'), solution(answerKey, k, 'F'));
        
        return max;
    }
    
    public int solution(String answerKey, int k, char ch)
    {
        int lt = 0;
        int count = 0;
        int max = 0;
        
        for(int rt = 0; rt < answerKey.length(); rt++)
        {
            if(answerKey.charAt(rt) == ch)
                count++;
            
            while(count > k)
            {
                if(answerKey.charAt(lt++) == ch)
                    count--;
            }
            
            max = Math.max(max, rt - lt + 1);
        }
        
        return max;
    }
}