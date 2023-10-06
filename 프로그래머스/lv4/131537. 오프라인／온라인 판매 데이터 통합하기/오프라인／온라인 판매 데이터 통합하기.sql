(select DATE_FORMAT(SALES_DATE,'%Y-%m-%d') as SALES_DATE,
        PRODUCT_ID,
        user_id,
        SALES_AMOUNT
from ONLINE_SALE n
where SALES_DATE like '2022-03%' 
union
select DATE_FORMAT(SALES_DATE,'%Y-%m-%d') as SALES_DATE,
        PRODUCT_ID,
        NULL as user_id,
        SALES_AMOUNT
from OFFLINE_SALE f
where SALES_DATE like '2022-03%')
ORDER BY SALES_DATE, PRODUCT_ID, user_id;