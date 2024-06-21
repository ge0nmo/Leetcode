class Solution {
    public List<Integer> getRow(int n) {
        
        int arr[] = new int[n + 1];
        arr[0] = 1;
        
        
        for(int i = 1; i <= n; i++)
        {
            for(int j = i; j > 0; j--)
            {
                arr[j] += arr[j - 1];
            }
        }
        
        List<Integer> list = new ArrayList();
        for(int num : arr)
        {
            if(num == 0)
                break;
            
            list.add(num);
        }
        
        
        return list;
        
    }
}


// n번만큼 반복문을 돌린다
// 이전 리스트를 가져온다
// 양 옆은 1로 채운다
// 가운데는 이전 리스트와 비교해서 구한다