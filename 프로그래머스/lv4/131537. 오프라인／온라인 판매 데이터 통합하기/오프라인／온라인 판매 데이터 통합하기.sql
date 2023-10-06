select DATE_FORMAT(t.SALES_DATE, '%Y-%m-%d') as SALES_DATE,
        t.PRODUCT_ID,
        t.user_id,
        t.SALES_AMOUNT
from (select SALES_DATE,
        PRODUCT_ID,
        user_id,
        SALES_AMOUNT
from ONLINE_SALE 
union
select SALES_DATE,
        PRODUCT_ID,
        NULL as user_id,
        SALES_AMOUNT
from OFFLINE_SALE 
) as t
where SALES_DATE like '2022-03%'
ORDER BY t.SALES_DATE, t.PRODUCT_ID, t.user_id;