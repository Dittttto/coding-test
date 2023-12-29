select FLAVOR
from (
    SELECT h.SHIPMENT_ID, h.FLAVOR, (j.TOTAL_ORDER + h.TOTAL_ORDER) TOTAL_ORDER
    from FIRST_HALF h inner join 
    (select SHIPMENT_ID, flavor, sum(total_order) total_order
        from july jj
        group by FLAVOR) j
        on h.SHIPMENT_ID = j.SHIPMENT_ID
) o
order by TOTAL_ORDER desc
limit 3;

select FLAVOR
from
((select * 
from FIRST_HALF h)
union
(select *
from july j)) o
group by FLAVOR
order by sum(TOTAL_ORDER) desc
limit 3;
