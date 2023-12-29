select o.PRODUCT_ID PRODUCT_ID, PRODUCT_NAME, (PRICE * amount) TOTAL_SALES  from FOOD_PRODUCT p inner join 
(SELECT PRODUCT_ID, sum(AMOUNT) amount
from FOOD_ORDER 
where date_format(PRODUCE_DATE, '%Y-%m') = '2022-05'
group by PRODUCT_ID) o
on p.PRODUCT_ID = o.PRODUCT_ID
order by TOTAL_SALES desc, PRODUCT_ID;
