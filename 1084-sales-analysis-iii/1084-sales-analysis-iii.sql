# Write your MySQL query statement below
WITH rejected_ids AS (
    SELECT s.product_id
    FROM sales s
    WHERE s.sale_date NOT BETWEEN DATE('2019-01-01') AND DATE('2019-03-31')
)
SELECT DISTINCT p.product_id, p.product_name
FROM product p
INNER JOIN sales s ON s.product_id = p.product_id
LEFT JOIN rejected_ids r ON r.product_id = p.product_id
WHERE s.sale_date BETWEEN DATE('2019-01-01') AND DATE('2019-03-31') AND r.product_id IS NULL