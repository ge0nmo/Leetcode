# Write your MySQL query statement below

SELECT 
    a.class
FROM
    (SELECT c.class, COUNT(*) as count FROM Courses c GROUP BY c.class) as a
WHERE count >= 5