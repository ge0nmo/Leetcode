class Solution {
    public int minimumCost(int[] cost) {
        Integer[] arr = Arrays.stream(cost)
            .boxed()
            .toArray(Integer[]::new);
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if((i + 1) % 3 != 0){
                sum += arr[i];
            }
        }
        
        return sum;       
    }
}

// 9 7 6 5 2 2