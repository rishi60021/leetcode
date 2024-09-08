# Write your MySQL query statement below

SELECT customer_id, COUNT(visit_id) AS count_no_trans
FROM 
(
    SELECT Visits.customer_id, Visits.visit_id
    FROM Visits 
    LEFT JOIN Transactions ON Visits.visit_id = Transactions.visit_id
    WHERE Transactions.transaction_id IS NULL
) AS no_transaction_visits
GROUP BY customer_id;

