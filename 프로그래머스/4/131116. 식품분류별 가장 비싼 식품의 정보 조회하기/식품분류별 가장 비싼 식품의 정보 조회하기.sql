select f.CATEGORY,max MAX_PRICE, f.PRODUCT_NAME
from food_product f inner join
(SELECT CATEGORY, max(PRICE) max
from food_product
where CATEGORY in ('과자', '국', '김치', '식용유')
group by CATEGORY) a on f.CATEGORY = a.CATEGORY and f.price = a.max
order by MAX_PRICE desc;
