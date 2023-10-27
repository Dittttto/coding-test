-- 코드를 입력하세요
SELECT Animal_type, count(*)
from ANIMAL_INS
group by ANIMAL_TYPE
order by Animal_type;