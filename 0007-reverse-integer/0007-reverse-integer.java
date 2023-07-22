class Solution 
{
    public int reverse(int x) 
    {
        String num = String.valueOf(x);
        String minus = "";
        
        if(num.charAt(0) == '-')
        {
            minus = "-";
            num = num.substring(1);
        }
        
        StringBuilder sb = new StringBuilder(num);
        String result = minus + sb.reverse().toString();
        
        try{
            return Integer.parseInt(result);
        } catch(NumberFormatException e){
            return 0;
        }
    }
}