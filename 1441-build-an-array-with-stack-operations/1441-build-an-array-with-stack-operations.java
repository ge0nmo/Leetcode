class Solution {
    public List<String> buildArray(int[] target, int n) {    
        List<String> answer = new ArrayList();
        String push = "Push";
        String pop = "Pop";
        
        int start = 1;
        for(int i = 0; i < target.length; i++)
        {
            answer.add(push);
            if(target[i] != start)
            {
                answer.add(pop);
                i--;
            }
            start++;
        }
        
        return answer;
    }
}