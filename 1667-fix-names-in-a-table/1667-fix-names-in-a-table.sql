# Write your MySQL query statement below

Select user_id, CONCAT(UCASE(SUBSTRING(name,1,1)),LCASE(SUBSTRING(name,2))) AS name from Users
ORDER BY user_id;