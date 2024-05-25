class Solution {
    public int countStudents(int[] students, int[] sandwiches) {                
        Queue<Integer> queue = new LinkedList();
        
        for(int student : students)
        {
            queue.offer(student);
        }
        
        int count = 0;
        
        for(int sandwich : sandwiches)
        {
            int size = queue.size();
            
            boolean found = false;
            
            for(int i = 0; i < size; i++)
            {
                int pref = queue.poll();
                if(pref == sandwich)
                {
                    found = true;
                    break;
                }
                queue.offer(pref);
            }
            
            if(!found)
            {
                count = size;
                break;
            }
            
        }
        
        return count;
    }
}