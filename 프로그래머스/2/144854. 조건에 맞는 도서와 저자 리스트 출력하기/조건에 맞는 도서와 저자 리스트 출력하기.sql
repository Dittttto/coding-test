select book_id, AUTHOR_NAME, date_format(PUBLISHED_DATE, '%Y-%m-%d') PUBLISHED_DATE
from (select *
from book b
where CATEGORY = '경제') bb left join AUTHOR a on bb.AUTHOR_ID = a.AUTHOR_ID
order by PUBLISHED_DATE;