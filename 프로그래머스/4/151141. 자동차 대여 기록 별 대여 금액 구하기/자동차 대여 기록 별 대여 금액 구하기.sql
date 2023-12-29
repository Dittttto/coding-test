select history_id, cast((fee * (1 - if(top.duration_type='없음', 0, discount_rate)/100)) as signed integer) fee
from (select *, case
            when duration >= 90 then '90일 이상'
            when duration >= 30 then '30일 이상'
            when duration >= 7 then '7일 이상'
            else '없음'
            end duration_type
from (
    (select a.history_id, 
    a.car_id, 
    (datediff(end_date, start_date) +1) duration,
    ((datediff(end_date, start_date) +1) * daily_fee) fee
    from  CAR_RENTAL_COMPANY_RENTAL_HISTORY a join CAR_RENTAL_COMPANY_CAR b on a.car_id = b.car_id
    where b.car_type = '트럭')) inn) top left join (select * from CAR_RENTAL_COMPANY_DISCOUNT_PLAN where car_type = '트럭')p on top.duration_type = p.duration_type 
    order by fee desc, history_id desc;