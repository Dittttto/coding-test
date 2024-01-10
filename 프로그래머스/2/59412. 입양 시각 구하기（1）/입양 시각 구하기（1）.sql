-- 코드를 입력하세요
SELECT distinct extract(hour from datetime) as hour, count(1) COUNT
from ANIMAL_OUTS
where hour(datetime) >= 9 and hour(datetime) < 20
group by hour(datetime)
order by hour;