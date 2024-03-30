# Write your MySQL query statement below

UPDATE SALARY
SET SEX = CASE WHEN sex = 'm' THEN 'f' WHEN sex = 'f' THEN 'm' END

