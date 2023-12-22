select month(o.start_date) month,
        o.car_id,
     count(2) records
from CAR_RENTAL_COMPANY_RENTAL_HISTORY o inner join (SELECT
    START_DATE,
    CAR_ID,
    count(CAR_ID) cnt
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where START_DATE >= '2022-08-01'and START_DATE< '2022-11-01'
group by car_id
having cnt >= 5) a on o.car_id = a.car_id
where o.START_DATE >= '2022-08-01'and o.START_DATE< '2022-11-01'
group by month, o.car_id
order by month, car_id desc;


# select car_id, count(car_id) cnt from CAR_RENTAL_COMPANY_RENTAL_HISTORY
# where START_DATE >= '2022-08-01'and START_DATE< '2022-11-01'
# group by car_id
# having cnt >= 5
# order by START_DATE;

# select * from CAR_RENTAL_COMPANY_RENTAL_HISTORY
# where car_id = 28;