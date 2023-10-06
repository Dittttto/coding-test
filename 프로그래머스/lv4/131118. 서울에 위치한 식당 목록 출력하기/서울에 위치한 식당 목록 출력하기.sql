-- 코드를 입력하세요
SELECT i.REST_ID, 
        i.REST_NAME, 
        i.FOOD_TYPE,
        i.FAVORITES,
        i.ADDRESS,
        ROUND(AVG(r.REVIEW_SCORE), 2) as SCORE
from (select * from REST_INFO where ADDRESS like '서울%' ) i
join REST_REVIEW r on i.REST_ID = r.REST_ID
group by i.REST_ID
order by score desc, i.FAVORITES desc;