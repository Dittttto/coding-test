select p.PRODUCT_CODE, (amount * price) SALES
from 
(SELECT product_id, sum(SALES_AMOUNT) amount
from OFFLINE_SALE
group by product_id) a inner join PRODUCT p on a.product_id = p.product_id
order by SALES desc, PRODUCT_CODE;