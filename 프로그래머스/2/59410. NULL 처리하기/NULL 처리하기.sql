SELECT ANIMAL_TYPE,
    case when NAME is null then "No name"
         else name end as name,
    SEX_UPON_INTAKE
from ANIMAL_INS;