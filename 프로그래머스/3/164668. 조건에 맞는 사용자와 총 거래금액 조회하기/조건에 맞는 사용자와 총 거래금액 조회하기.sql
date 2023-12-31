-- 코드를 입력하세요
select user_id, nickname, total_sales 
from (SELECT writer_id, sum(price) total_sales
from USED_GOODS_BOARD
where `status` = 'DONE'
group by writer_id
having total_sales >= 700000) t inner join USED_GOODS_USER u on t.writer_id = u.user_id
order by total_sales;
