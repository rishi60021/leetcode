select customer_id,count(visit_id) as count_no_trans
from
(select Visits.visit_id,Visits.customer_id from Visits left join Transactions on Visits.visit_id=Transactions.visit_id 
where Transactions.transaction_id is null) as no_trans_visit
group by customer_id;