# Write your MySQL query statement below
SELECT unique_id,name FROM Employees  as emp
left join employeeUNI as uni
on uni.id = emp.id
