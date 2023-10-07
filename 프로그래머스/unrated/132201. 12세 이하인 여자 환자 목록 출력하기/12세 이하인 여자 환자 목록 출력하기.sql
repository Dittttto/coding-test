-- 코드를 입력하세요
SELECT PT_NAME, PT_NO, GEND_CD, AGE, case when (TLNo is null) then 'NONE' else TLNo end as TLNo
From PATIENT
where age <= 12 and GEND_CD = 'W'
order by age desc, PT_NAME;