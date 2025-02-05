class Solution {
    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int length = happiness.length - 1;
        long sum = 0;
        for (int i = 0; i < k; i++) {
            if (happiness[length - i] < i)
                return sum;

            sum += happiness[length - i] - i;
        }

        return sum;
    }
}

// sort desc
// start from 0 index as i = 0
// add each array[index] value and decrease i in each
// stop if the array[index] value is less than i