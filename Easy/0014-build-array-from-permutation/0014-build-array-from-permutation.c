/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* buildArray(int* nums, int numsSize, int* returnSize) {
    int* answer = malloc(numsSize * sizeof(int));
    if(!answer) return NULL;

    for(int i = 0; i < numsSize; i++)
    {
        answer[i] = nums[nums[i]];
    }

    *returnSize = numsSize;
    return answer;
}