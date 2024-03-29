class Solution 
{
    public int reverse(int x)
    {
    
    int result = 0;

    while (x != 0)
    {
        int tail = x % 10;
        int answer = result * 10 + tail;
        if ((answer - tail) / 10 != result)
            return 0; 
        result = answer;
        x = x / 10;
    }

    return result;


    } 
}