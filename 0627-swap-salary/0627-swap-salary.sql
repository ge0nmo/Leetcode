# Write your MySQL query statement below

UPDATE SALARY
SET SEX = CHAR(ASCII('f') ^ ASCII('m') ^ ASCII(sex))

