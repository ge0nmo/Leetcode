# Write your MySQL query statement below

# group by project_id로 묶기
# avg(experience_years)로 평균 구하기

SELECT
    p.project_id,
    ROUND(AVG(e.experience_years), 2) as average_years
FROM
    Employee e
JOIN
    Project p ON p.employee_id = e.employee_id
GROUP BY
    p.project_id