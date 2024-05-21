class Solution {
    public List<String> buildArray(int[] target, int n) {    
        List<String> answer = new ArrayList();
        String push = "Push";
        String pop = "Pop";
        
        int start = 1;
        for(int num : target)
        {
            while(num != start)
            {
                answer.add(push);
                answer.add(pop);
                start++;
            }
            
            answer.add(push);
            start++;
        }
        
        return answer;
    }
}