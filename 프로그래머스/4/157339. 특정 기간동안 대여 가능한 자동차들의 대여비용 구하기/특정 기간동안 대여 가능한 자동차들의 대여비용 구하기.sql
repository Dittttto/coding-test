select car_id, car_type, fee
from (
    select o.car_id, o.car_type, cast((daily_fee * 30 * (1-discount_rate/100)) as signed integer)fee
    from (select distinct(t.car_id), t.car_type, t.daily_fee
        from CAR_RENTAL_COMPANY_CAR t left join CAR_RENTAL_COMPANY_RENTAL_HISTORY h 
        on t.CAR_ID = h.CAR_ID
        where end_date < '2022-11-1' and car_type in ('SUV', '세단')) o
        left join (select * from CAR_RENTAL_COMPANY_DISCOUNT_PLAN where duration_type like '30%') p
        on o.car_type = p.car_type
) t
where fee >= 50000 and fee < 2000000
order by fee desc, car_type, car_id desc;

select * from (
select i.car_id, i.car_type, cast((daily_fee * 30 * (1-discount_rate/100)) as signed integer) fee
from(select * 
from CAR_RENTAL_COMPANY_CAR t
where car_id not in (select car_id from CAR_RENTAL_COMPANY_RENTAL_HISTORY where end_date >= '2022-11-1')
and car_type in ('세단', 'SUV')) i
left join (select discount_rate, car_type from CAR_RENTAL_COMPANY_DISCOUNT_PLAN where duration_type like '30%' ) p
on i.car_type = p.car_type
) tt
 where fee >= 50000 and fee < 2000000
 order by fee desc, car_type, car_id desc
;