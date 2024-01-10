-- 코드를 입력하세요

select INGREDIENT_TYPE, sum(total_order) TOTAL_ORDER
from FIRST_HALF f inner join ICECREAM_INFO i on f.FLAVOR = i.FLAVOR
group by INGREDIENT_TYPE 
order by TOTAL_ORDER;