class Solution {
    public int search(int[] nums, int target) {
        if(nums[0] <= nums[nums.length - 1]){
            return binarySearch(nums, 0, nums.length - 1, target);
        }
        
        int point = findMidPointer(nums);
        return nums[0] > target ? binarySearch(nums, point, nums.length - 1, target) 
        : binarySearch(nums, 0, point - 1, target);
    }

    public int binarySearch(int[] nums, int left, int right, int target)
    {
        while(left <= right){
            int mid = (left + right) / 2;

            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }

        return -1;
    }

    public int findMidPointer(int[] nums)
    {
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int mid = (left + right) / 2;            

            if(nums[mid] > nums[right]){
                left = mid + 1;
            } else{
                right = mid;
            }            
        }

        return left;
    }
}

// 배열의 가운데 point를 구함
// target이 배열의 0번째 값보다 크다면 왼쪽에서 탐색
// 그렇지 않다면 오른쪽에서 탐색