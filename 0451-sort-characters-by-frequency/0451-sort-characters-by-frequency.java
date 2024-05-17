class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        
        Map<Character, Integer> map = new HashMap();
        
        for(char ch : s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        List<Character> sortedList = map.entrySet().stream()
            .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
        
        for(char ch : sortedList)
        {
            int num = map.get(ch);
            for(int i = 0; i < num; i++)
            {
                sb.append(ch);
            }
            
        }
        
        return sb.toString();
    }
}