int binarySearch(int* nums, int left, int right, int target);
int findPivot(int* nums, int numsSize);

int search(int* nums, int numsSize, int target) {
    if(nums[0] < nums[numsSize - 1]) return binarySearch(nums, 0, numsSize - 1, target);
    
    int pivot = findPivot(nums, numsSize);

    if(nums[0] > target) return binarySearch(nums, pivot, numsSize - 1, target);    

    return binarySearch(nums, 0, pivot, target);
}

int findPivot(int* nums, int numsSize)
{
    int left = 0;
    int right = numsSize - 1;

    while(left < right)
    {
        int mid = (left + right) / 2;

        if(nums[mid] > nums[right]) left = mid + 1;
        else right = mid;        
    }

    return left;
}


int binarySearch(int* nums, int left, int right, int target)
{
    while(left <= right)
    {
        int mid = (left + right) / 2;

        if(nums[mid] == target) return mid;

        else if(nums[mid] > target) right = mid - 1;
        else left = mid + 1;
    }

    return -1;
}