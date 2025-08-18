-- 코드를 입력하세요
SELECT count(*) as USERS

from user_info

where to_char(joined, 'YYYY') = '2021'

and age between 20 and 29;