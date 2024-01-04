select a.AUTHOR_ID, a.AUTHOR_NAME, b.category , (sum(sales) * b.PRICE) TOTAL_SALES
from (
SELECT book_id, sum(sales) sales
    from BOOK_SALES
    where date_format(SALES_DATE, '%Y-%m') = '2022-01'
    group by book_id
) s
inner join BOOK b on s.book_id = b.book_id
inner join AUTHOR a on b.author_id = a.AUTHOR_ID
group by author_name, category
order by a.AUTHOR_ID, b.category desc;

select author_id, author_name, category, sum(total_sales) total_sales
from (
    select a.author_id, a.author_name, category, (sales * price) total_sales
    from (
        SELECT book_id, sum(sales) sales
            from BOOK_SALES
            where date_format(SALES_DATE, '%Y-%m') = '2022-01'
            group by book_id
        ) s
    inner join BOOK b on s.book_id = b.book_id
    inner join AUTHOR a on b.author_id = a.AUTHOR_ID) ss
group by author_name, category
order by author_id, category desc;