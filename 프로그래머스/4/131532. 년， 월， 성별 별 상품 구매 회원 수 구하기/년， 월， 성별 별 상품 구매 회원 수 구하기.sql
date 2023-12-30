SELECT year(o.sales_date) year, month(o.sales_date) month, u.gender, count(distinct u.user_id) users
from user_info u inner join online_sale o on u.user_id = o.user_id
where u.gender is not null
group by year, month, gender
order by year, month, gender;