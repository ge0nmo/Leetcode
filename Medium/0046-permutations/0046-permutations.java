class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList();
        boolean visited[] = new boolean[nums.length];
        backtrack(answer, new ArrayList<Integer>(), nums, visited);
        
        return answer;
    }

    public void backtrack(List<List<Integer>> answer, List<Integer> cur, int[] nums, boolean[] visited)
    {
        if(nums.length == cur.size()){
            answer.add(new ArrayList<>(cur));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(visited[i]) continue;
        
            cur.add(nums[i]);
            visited[i] = true;
            backtrack(answer, cur, nums, visited);
            cur.remove(cur.size() - 1);
            visited[i] = false;
        }
    }
}