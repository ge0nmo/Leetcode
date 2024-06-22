class Solution {
    public int getKth(int lo, int hi, int k) {
        List<Point> answer = new ArrayList();
        for(int i = lo; i <= hi; i++)
        {
            int powerValue = calculatePowerValue(i);
            answer.add(new Point(i, powerValue));
        }
        
        Collections.sort(answer);
        
        return answer.get(k - 1).x;
        
    }
    
    public int calculatePowerValue(int n)
    {
        int count = 0;
        while(n != 1)
        {
            ++count;
            if(n % 2 == 1)            
                n = (n * 3) + 1;
                        
            else
                n /= 2;                
        }
        
        return count;
    }
}

class Point implements Comparable<Point>
{
    int x;
    int y;
    
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p)
    {
        if(p.y == this.y)
            return this.x - p.x;
        
        return this.y - p.y;            
    }
}




// 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1

// 12, 13, 14, 15

// 12 -> 6 -> 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1

// 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1

// 14 -> 7 -> 22 -> 11 -> 34 -> 17 -> 52 -> 26 -> 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1

// 15 -> 46 -> 23 -> 70 -> 35 -> 106 -> 53 -> 160 -> 80 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1


// (12, 7), (13, 9), (14, 17), (15, 17)


// check the all power number of numbers between lo and hi 
// store them into array as x(number) and y(power value)
// sort it order by power value
// return the kth power value