# Write your MySQL query statement below

SELECT
    student.student_id,
    student.student_name,
    sub.subject_name,
    COUNT(e.student_id) AS attended_exams
FROM
    Students AS student
CROSS JOIN
    Subjects AS sub
LEFT JOIN
    Examinations AS e
ON e.subject_name = sub.subject_name
    AND e.student_id = student.student_id
GROUP BY
    student.student_id, sub.subject_name
ORDER BY
    student_id, subject_name
