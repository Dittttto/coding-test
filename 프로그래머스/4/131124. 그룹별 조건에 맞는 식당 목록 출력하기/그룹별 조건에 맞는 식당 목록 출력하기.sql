select MEMBER_NAME, REVIEW_TEXT, date_format(REVIEW_DATE, '%Y-%m-%d') REVIEW_DATE
from (select * 
from REST_REVIEW
where member_id in (select MEMBER_ID
                    from(
                        SELECT MEMBER_ID, count(MEMBER_ID) reviews
                        from REST_REVIEW
                        group by MEMBER_ID
                        order by reviews desc
                        limit 1
                    )a)) a left join MEMBER_PROFILE m on a.MEMBER_ID = m.MEMBER_ID
                    order by REVIEW_DATE, REVIEW_TEXT;