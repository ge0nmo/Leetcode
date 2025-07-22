class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList();
        backtrack(answer, new ArrayList<Integer>(), nums);
        return answer;
    }

    public void backtrack(List<List<Integer>> answer, List<Integer> cur, int[] nums)
    {
        if(nums.length == cur.size()){
            answer.add(new ArrayList<>(cur));
            return;
        }

        for(int num : nums){
            if(cur.contains(num)) continue;

            cur.add(num);
            backtrack(answer, cur, nums);
            cur.remove(cur.size() - 1);
        }
    }
}