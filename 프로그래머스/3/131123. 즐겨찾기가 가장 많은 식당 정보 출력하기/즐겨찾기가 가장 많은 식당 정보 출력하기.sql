select a.food_type, r.rest_id, r.rest_name, a.FAVORITES
from
(SELECT FOOD_TYPE, max(FAVORITES) FAVORITES
from rest_info
group by FOOD_TYPE) a left join rest_info r on a.food_type = r.food_type and a.favorites = r.favorites
order by a.food_type desc;