# select 
#     distinct(o.user_id),
#      year(o.sales_date) year,
#      month(o.sales_date) month,
#      count(2) PUCHASED_USERS, 
#      round(count(2) / (select 
#     count(user_id) count
# from user_info
# where year(joined) = '2021'), 1) PUCHASED_RATIO
# from user_info u inner join online_sale o on u.user_id = o.user_Id
# where year(u.joined) = '2021'
# group by year, month
# order by year, month;

# select 
#      year(o.sales_date) year,
#      month(o.sales_date) month,
#      count(2) cnt
# from user_info u inner join online_sale o on u.user_id = o.user_Id
# where year(u.joined) = '2021'
# group by year, month;

select  
    year(sales_date) year,
     month(sales_date) month,
     user_id
from (
select distinct(u.user_id), o.sales_date
from user_info u inner join online_sale o on u.user_id = o.user_Id
where year(u.joined) = '2021') ds
order by year, month;


select
    year,
    month,
    count(month) PUCHASED_USERS,
    round(count(month) / (select 
    count(user_id) count
    from user_info
    where year(joined) = '2021'), 1) PUCHASED_RATIO
from (
select year(o.sales_date) year,
     month(o.sales_date) month,
     count(distinct(o.user_id)) user_count
from user_info u inner join online_sale o on u.user_id = o.user_Id
where year(u.joined) = '2021'
group by year, month, o.user_Id) tt
group by year, month;
