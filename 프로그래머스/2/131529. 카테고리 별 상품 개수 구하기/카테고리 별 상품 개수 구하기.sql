-- 코드를 입력하세요
SELECT substring(product_code, 1, 2) CATEGORY,
    count(1) PRODUCTS
from product
group by CATEGORY
order by CATEGORY;