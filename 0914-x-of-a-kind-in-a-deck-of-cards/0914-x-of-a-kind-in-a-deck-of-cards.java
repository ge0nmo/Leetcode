class Solution {
    public boolean hasGroupsSizeX(int[] deck) {

        Map<Integer, Integer> map = new HashMap();
        
        for(int num : deck)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int answer = 0;        
        for(int num : map.values())
        {
            answer = gcd(answer, num);
        }
        
        return answer >= 2;
    }
    
    public int gcd(int a, int b)
    {
        if(b == 0) return a;
        
        return gcd(b, a % b);
    }
}