# Write your MySQL query statement below
SELECT product_name,year,price FROM Product AS P
JOIN Sales AS S
ON  S.product_id = P.product_id;