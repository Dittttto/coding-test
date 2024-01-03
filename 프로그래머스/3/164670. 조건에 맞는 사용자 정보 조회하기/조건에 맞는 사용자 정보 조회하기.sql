-- 코드를 입력하세요

select user_id, nickname, concat(CITY, ' ',STREET_ADDRESS1,' ', STREET_ADDRESS2 ) `전체주소`, concat(substring(TLNO, 1, 3), '-',substring(TLNO, 4, 4), '-', substring(TLNO, 8,4)) `전화번호`
from USED_GOODS_USER
where USER_ID in (SELECT WRITER_ID
from USED_GOODS_BOARD
group by WRITER_ID
having count(WRITER_ID) >= 3)
order by user_id desc;

