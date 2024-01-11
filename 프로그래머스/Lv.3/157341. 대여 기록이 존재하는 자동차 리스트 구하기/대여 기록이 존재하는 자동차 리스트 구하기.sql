-- 코드를 입력하세요
SELECT distinct(c.car_id) car_id
from CAR_RENTAL_COMPANY_RENTAL_HISTORY c inner join (select * from CAR_RENTAL_COMPANY_CAR where CAR_TYPE = '세단') o on c.CAR_ID = o.CAR_ID
where month(START_DATE) = 10
order by c.car_id desc;