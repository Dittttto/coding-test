SELECT CART_ID
from CART_PRODUCTS
where name = 'Milk' or name = 'Yogurt' 
group by CART_ID
having count(cart_id) >= 2
order by CART_ID;

select cart_id
from (
select distinct(cart_id), name
from CART_PRODUCTS
where name = 'Milk' or name = 'Yogurt') t
group by cart_id
having count(cart_id) >= 2;