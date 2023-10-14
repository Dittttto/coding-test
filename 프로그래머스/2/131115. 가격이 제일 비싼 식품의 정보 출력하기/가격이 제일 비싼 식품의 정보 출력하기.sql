select t.PRODUCT_ID, t.PRODUCT_NAME, t.PRODUCT_CD, t.CATEGORY, t.PRICE
from FOOD_PRODUCT as t
where t.price = (SELECT max(a.price)
from FOOD_PRODUCT as a);