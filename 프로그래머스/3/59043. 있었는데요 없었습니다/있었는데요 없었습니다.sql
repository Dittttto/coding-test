SELECT i.ANIMAL_ID,  i.NAME
from animal_ins i inner join ANIMAL_OUTS o on i.animal_id = o.animal_id
where i.DATETIME > o.DATETIME
order by i.DATETIME;