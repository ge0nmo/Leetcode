class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList();
        
        answer.add(List.of(1));
        
        for(int i = 1; i < numRows; i++)
        {
            List<Integer> subList = new ArrayList();            
            List<Integer> prevList = answer.get(i - 1);
            
            subList.add(1);
            for(int j = 0; j < prevList.size() - 1; j++)
            {
                int n = prevList.get(j) + prevList.get(j + 1);
                subList.add(n);
            }
            subList.add(1);
            
            answer.add(subList);
        }
        
        return answer;
    }
    
    
}

// iterate until numRows = 0

// get the last list of the list

// iterate the list

// set the first and the last index as 1

//  0, 1, 2, 3
//0   1, 2, 3  4


// n = last index n + n - 1

// 