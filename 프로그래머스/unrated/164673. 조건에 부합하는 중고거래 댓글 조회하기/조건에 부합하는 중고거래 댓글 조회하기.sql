-- 코드를 입력하세요
SELECT t.TITLE, t.BOARD_ID, s.REPLY_ID, s.WRITER_ID, s.CONTENTS, date_format(s.CREATED_DATE, "%Y-%m-%d") as CREATED_DATE
from (select * from USED_GOODS_BOARD where CREATED_DATE like '2022-10-%') t
join USED_GOODS_REPLY s on t.BOARD_ID = s.BOARD_ID
order by s.CREATED_DATE, t.TITLE;