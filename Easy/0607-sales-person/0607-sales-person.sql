# Write your MySQL query statement below

SELECT s.name
FROM SalesPerson s
WHERE s.sales_id NOT IN (
    SELECT distinct o.sales_id 
    FROM Orders o
    Join Company c ON c.com_id = o.com_id
    WHERE c.name = 'RED'
    )