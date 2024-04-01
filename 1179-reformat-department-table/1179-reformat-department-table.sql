# Write your MySQL query statement below

SELECT 
    id,
    Sum(CASE WHEN month = 'Jan' THEN revenue END) as Jan_Revenue,
    Sum(CASE WHEN month = 'Feb' THEN revenue END) as Feb_Revenue,
    Sum(CASE WHEN month = 'Mar' THEN revenue END) as Mar_Revenue,
    Sum(CASE WHEN month = 'Apr' THEN revenue END) as Apr_Revenue,
    Sum(CASE WHEN month = 'May' THEN revenue END) as May_Revenue,
    Sum(CASE WHEN month = 'Jun' THEN revenue END) as Jun_Revenue,
    Sum(CASE WHEN month = 'Jul' THEN revenue END) as Jul_Revenue,
    Sum(CASE WHEN month = 'Aug' THEN revenue END) as Aug_Revenue,
    Sum(CASE WHEN month = 'Sep' THEN revenue END) as Sep_Revenue,
    Sum(CASE WHEN month = 'Oct' THEN revenue END) as Oct_Revenue,
    Sum(CASE WHEN month = 'Nov' THEN revenue END) as Nov_Revenue,
    Sum(CASE WHEN month = 'Dec' THEN revenue END) as Dec_Revenue   
FROM Department
GROUP BY id