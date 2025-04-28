# Write your MySQL query statement below

# group by project_id로 묶기
# avg(experience_years)로 평균 구하기
# 필요한 값만 가져오기

SELECT
    p.project_id,
    ROUND(AVG(e.experience_years), 2) as average_years
FROM
    Project p
JOIN
    (SELECT employee_id, experience_years FROM Employee) e ON e.employee_id = p.employee_id
GROUP BY
    p.project_id