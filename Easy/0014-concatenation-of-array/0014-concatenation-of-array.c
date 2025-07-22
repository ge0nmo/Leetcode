/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getConcatenation(int* nums, int numsSize, int* returnSize) {
    nums = realloc(nums, numsSize * 2 * sizeof(int));
    printf("%d", sizeof(nums));

    for(int i = 0; i < numsSize; i++){
        nums[i + numsSize] = nums[i];
    }
    *returnSize = numsSize * 2;
    return nums;
}


// 0 1 2 3 4 
// 5 6 7 8 9