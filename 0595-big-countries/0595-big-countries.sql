# Write your MySQL query statement below

SELECT
    w.name, 
    w.population, 
    w.area 
from 
    World w
WHERE w.area >= 3000000
    OR w.population >= 25000000
ORDER BY w.name ASC
