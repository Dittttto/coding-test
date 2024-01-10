-- 코드를 입력하세요
select *
from PLACES
where host_id in (SELECT host_id
from PLACES
group by host_id
having count(host_id) > 1)
order by ID;