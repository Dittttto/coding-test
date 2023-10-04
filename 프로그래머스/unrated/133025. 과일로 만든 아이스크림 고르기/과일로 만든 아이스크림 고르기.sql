-- 코드를 입력하세요
select f.flavor from 
(select * from FIRST_HALF where TOTAL_ORDER >= 3000)
f join ICECREAM_INFO i on f.flavor = i.flavor
where INGREDIENT_TYPE = 'fruit_based'
order by total_order desc;
