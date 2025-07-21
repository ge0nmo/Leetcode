class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList();
        backtrack(answer, new ArrayList<Integer>(), target, 0, candidates);
        return answer;
    }

    public void backtrack(List<List<Integer>> answer, List<Integer> cur, int target, int index, int[] candidates)
    {
        if(target == 0){
            answer.add(new ArrayList<Integer>(cur));
            return;
        }

        if(target < 0) return;

        for(; index < candidates.length; index++){
            int candidate = candidates[index];            
            cur.add(candidate);
            backtrack(answer, cur, target - candidate, index, candidates);
            cur.remove(cur.size() - 1);
        }
        

    }
}