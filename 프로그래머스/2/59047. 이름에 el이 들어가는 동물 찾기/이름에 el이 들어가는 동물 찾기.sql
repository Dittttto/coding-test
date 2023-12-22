-- 코드를 입력하세요
SELECT animal_Id, name
from animal_ins
where ANIMAL_TYPE = "Dog"
and name like "%EL%"
order by name;