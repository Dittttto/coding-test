-- 코드를 입력하세요
select animal_id,
    name
from(
SELECT i.animal_id,
    i.name,
    (o.datetime - i.datetime) duration
from animal_ins i inner join animal_outs o on i.animal_id = o.animal_id) t
order by duration desc
limit 2;