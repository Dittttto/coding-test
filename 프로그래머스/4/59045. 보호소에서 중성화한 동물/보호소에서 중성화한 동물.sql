select 
    a.ANIMAL_ID,
    a.ANIMAL_TYPE,
    a.NAME
from 

(SELECT * 
from animal_ins
where SEX_UPON_INTAKE like '%Intact%') a

inner join

(SELECT * 
from ANIMAL_OUTS
where SEX_UPON_OUTCOME not like '%Intact%')b

on a.animal_id = b.animal_id;