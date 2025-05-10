# Write your MySQL query statement below

SELECT 
    u.name,
    COALESCE(SUM(r.distance), 0) as travelled_distance
FROM
    Users u
LEFT JOIN Rides r ON r.user_id = u.id
GROUP BY
    u.id, u.name
ORDER BY 
    travelled_distance DESC, 
    u.name;