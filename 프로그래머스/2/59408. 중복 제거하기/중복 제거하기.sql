-- 코드를 입력하세요
SELECT count(*) as count
from (
    select distinct(name) from animal_ins where name is not null
)
