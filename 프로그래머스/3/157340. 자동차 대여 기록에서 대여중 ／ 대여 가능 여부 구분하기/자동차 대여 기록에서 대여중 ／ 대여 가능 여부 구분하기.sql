-- 코드를 입력하세요
SELECT CAR_ID,
    max(
        case
            when '2022-10-16' between date_format(START_DATE, '%Y-%m-%d') and date_format(END_DATE, '%Y-%m-%d') then '대여중'
            else '대여 가능'
        end 
    ) AVAILABILITY
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by CAR_ID
order by CAR_ID desc;