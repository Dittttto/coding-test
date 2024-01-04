select APNT_NO, PT_NAME, a.PT_NO, a.MCDP_CD, d.DR_NAME, APNT_YMD
from (
    SELECT APNT_NO, PT_NO, MCDP_CD,APNT_YMD, MDDR_ID
    from APPOINTMENT
    where date_format(APNT_YMD, '%Y-%m-%d') = '2022-04-13' and APNT_CNCL_YN = 'N' and MCDP_CD = 'CS'
) a inner join DOCTOR d on a.MDDR_ID = d.DR_ID inner join PATIENT p on a.PT_NO = p.PT_NO
order by APNT_YMD;

# select *
# from APPOINTMENT a
# inner join patient p on p.pt_no = a.pt_no
# inner join doctor d on d.dr_id = a.mddr_id
# where date_format(APNT_YMD, '%Y-%m-%d') = '2022-04-13';