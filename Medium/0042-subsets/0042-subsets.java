class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList();
        backtrack(0, nums, new ArrayList<Integer>(), answer);
        return answer;
    }

    public void backtrack(int start, int[] nums, List<Integer> cur, List<List<Integer>> answer)
    {
        answer.add(new ArrayList<>(cur));

        for(int i = start ; i < nums.length; i++){
            cur.add(nums[i]);
            backtrack(i + 1, nums, cur, answer);
            cur.remove(cur.size() - 1);
        }

    }
}