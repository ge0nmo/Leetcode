class Solution {
    public int maximum69Number (int num) {
        String str = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        boolean isChanged = false;
        for(char ch : str.toCharArray())
        {
            if(ch == '6' && !isChanged)
            {
                ch = '9';
                isChanged = true;
            }
            sb.append(ch);
        }
        
        return Integer.parseInt(sb.toString());
    }
}