-- 코드를 입력하세요
SELECT
category,
sum(b.sales) TOTAL_SALES
from BOOK a inner join  BOOK_SALES b on a.book_id = b.book_id
where year(SALES_DATE) = 2022 and month(SALES_DATE) = 1
group by category
order by category;