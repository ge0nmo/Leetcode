class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        int lt = 0;
        int answer = blocks.length();
        
        for(int i = 0; i < k; i++)
        {
            if(blocks.charAt(i) == 'W')
                count++;
        }
        
        answer = count;
        
        for(int rt = k; rt < blocks.length(); rt++)
        {                        
            if(blocks.charAt(rt) == 'W')
                count++;
                        
            if(blocks.charAt(lt++) == 'W')
                count--;            
            
            answer = Math.min(count, answer);
        }
        
        return answer;
    }
}