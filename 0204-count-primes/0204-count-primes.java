class Solution {
    public int countPrimes(int n)
    {
        if(n < 2)
            return 0;

        boolean array[] = new boolean[n + 1];
        int count = 0;


        for(int i = 2; i < n; i++)
        {
            if(!array[i])
            {
                count++;
                for(int j = i; j < n; j += i)
                {
                    array[j] = true;
                }
            }
        }

        return count;
    }
}