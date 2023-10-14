-- 코드를 입력하세요
SELECT count(*) as users
from USER_INFO
where joined like '2021%' AND AGE between 20 and 29;