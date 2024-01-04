SELECT *, concat("/home/grep/src/",b.BOARD_ID,"/",f.FILE_ID,f.FILE_NAME,f.FILE_EXT) FILE_PATH
from USED_GOODS_BOARD b
inner join USED_GOODS_FILE f on b.BOARD_ID = f.BOARD_ID
order by views desc, f.FILE_ID desc;


select concat("/home/grep/src/",BOARD_ID,"/",FILE_ID,FILE_NAME,FILE_EXT) FILE_PATH
from USED_GOODS_FILE
where BOARD_ID in(
select BOARD_ID
from(
select BOARD_ID
from USED_GOODS_BOARD
order by views desc
limit 1) b)
order by file_id desc;
