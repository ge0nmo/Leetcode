# Write your MySQL query statement below

SELECT
    patient_id,
    patient_name,
    conditions
FROM 
    Patients
WHERE
    locate('DIAB1', conditions) = 1
    or locate(' DIAB1', conditions) <> 0