SELECT i.name, i.DATETIME
from animal_ins i left join animal_outs o on i.ANIMAL_ID = o.ANIMAL_ID
where o.ANIMAL_ID is null
order by i.DATETIME
limit 3;